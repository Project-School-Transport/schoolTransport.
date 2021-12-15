
import { useState, useEffect } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";
import AdminStudent from './AdminStudent'
import Location from "./Location";

function Admin() {
    const [students, setStudents] = useState([]);
  const [student, setStudent] = useState({
    fName: '',
    lName: '',
    passWord: '',
    latitude: '',
    longitude: '',
   
 });
 const [ currentPosition, setCurrentPosition ] = useState({});
 const navigate = useNavigate();


const addStudent=(event)=>{
    event.preventDefault();
 
    const data = {
        fName: student.fName,
        lName: student.lName,
        passWord: student.passWord,
        latitude: currentPosition.lat,
        longitude: currentPosition.lng,
        school:{
            id:1
        }
    }

    axios
    .post(`http://localhost:8080/student/`,data)
    .then((res) => {
      console.log(res.data);
     
    })
    .catch((err) => {
      console.log(err);
    });
}
const viewAllStudent=()=>{
    axios
    .get(`http://localhost:8080/student/`)
    .then((res) => {
      console.log(res.data);
      setStudents(res.data);
     
    })
    .catch((err) => {
      console.log(err);
    });
}
const viewAllDriver=()=>{
    navigate("/adminDriver")
}



  return (
    <div className="App">
         <form onSubmit={addStudent}>
      <input
        type="text"
        placeholder="fName"
        value={student.fName}
        onChange={e => {
            setStudent({ ...student, fName: e.target.value });
        }}
      />
 <input
        type="text"
        placeholder="lName"
        value={student.lName}
        onChange={e => {
            setStudent({ ...student, lName: e.target.value });
        }}
      />
       <input
        type="passWord"
        placeholder="passWord"
        value={student.passWord}
        onChange={e => {
            setStudent({ ...student, passWord: e.target.value });
        }}
      />
      <Location currentPosition={currentPosition}  setCurrentPosition ={setCurrentPosition}/>
      <button>AddStudent</button>
    </form>
    <div className="">  
    <button onClick={viewAllDriver}> ViewAllDriver </button>
    <button onClick={viewAllStudent}> ViewAllStudent </button>
          {students.map((student) => {
               return <AdminStudent key={student.id} student={student} setStudents={setStudents} />;
          
          })}


    </div>
          
    </div>
  );
}

export default Admin;