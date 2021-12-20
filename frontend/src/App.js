import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Admin from "./components/Admin";
import Driver from "./components/AdminDriver";
import Student from "./components/Student";
import LocationAllStudent from './components/LocationAllStudent'
import AdminDriver from './components/AdminDriver'
import Register from "./components/Register";
import Login from "./components/Login";
function App() {
  return (
    <BrowserRouter>
    <Routes>






      <Route exact path="/Admin" element={<Admin />} />
      <Route exact path="/driver" element={<Driver />} />
      <Route exact path="/student" element={<Student />} />
      <Route exact path="/locationAllStudent" element={<LocationAllStudent />} />
      <Route exact path="/adminDriver" element={<AdminDriver />} />
    
      <Route exact path="/register" element={<Register />} />
        <Route exact path="/login" element={<Login />} />
    </Routes>
  </BrowserRouter>
  );
}

export default App;
