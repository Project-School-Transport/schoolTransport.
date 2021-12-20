import { useState, useEffect } from "react";
import { useNavigate, Navigate, useLocation } from "react-router-dom";
import { useSelector, useDispatch } from "react-redux";
import { addUser } from "../reducars/user/actions";
import axios from "axios";

function Login() {
  const dispatch = useDispatch();
  const navigate = useNavigate();
  const location = useLocation();
  const [email, setEmail] = useState("");
  const [password, setPassword] = useState("");

  const state = useSelector((state) => {
    return {
      user: state.userReducer.user,
    };
  });

  const handleChangeEmail = (e) => {
    setEmail(e.target.value);
  };

  const handleChangePassword = (e) => {
    setPassword(e.target.value);
  };

  const addTodo = () => {
    const data = {
      email,
      password,
    };

    axios
      .post("http://localhost:8080/users/login", data)
      .then((res) => {
        console.log(res.data);
        // add to redux
        const action = addUser(res.data);
        dispatch(action);
        navigate("/");
      })
      .catch((err) => {
        console.log(err);
      });
  };

  return (
    <>
      {/* {!state.user.id ? ( */}
        <div>
          <input type="text" onChange={handleChangeEmail} />
          <input type="text" onChange={handleChangePassword} />
          <button onClick={addTodo}> Login </button>
        </div>
      {/* ) : ( */}
        {/* <Navigate to="/" from={{ from: location }} /> */}
      {/* )} */}
    </>
  );
}

export default Login;
