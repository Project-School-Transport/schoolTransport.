const user = JSON.parse(localStorage.getItem("user"));
const initialState = {
  user: user ? user : {},
};

const userReducer = (state = initialState, { type, payload }) => {
  switch (type) {
    case "ADD_USER":
      localStorage.setItem("user", JSON.stringify(payload));
      return {
        user: payload,
      };
    case "REMOVE_USER":
      localStorage.removeItem("user");
      return {
        user: {},
      };

    default:
      return state;
  }
};

export default userReducer;
