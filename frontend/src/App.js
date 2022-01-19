import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";

// import Driver from "./components/AdminDriver";
import LocationAllStudent from './components/LocationAllStudent'

import Register from "./components/Register";
import Login from "./components/Login";
import HomeAdmin from "./components/PageSchool/HomeAdmin";
import PageDriver from "./components/PageDriver/PageDriver"
import PageStudent from "./components/PageStudent/PageStudent"
import Header from "./components/common/Header";
import Footer from "./PageHome/Footer";
import HomeApp from "./PageHome/HomeApp";


// import AppHome from './views/home';
function App() {
  return (
    <BrowserRouter>
    <Routes>

    



    <Route exact path="/" element={<HomeApp />} />
      
      {/* <Route exact path="/driver" element={<Driver />} /> */}
      <Route exact path="/locationAllStudent" element={<LocationAllStudent />} />
  
      <Route exact path="/home" element={<HomeAdmin />} />
      <Route exact path="/register" element={<Register />} />
        <Route exact path="/login" element={<Login />} /> 
        <Route exact path="/driver/:id" element={< PageDriver/>} /> 
        <Route exact path="/student/:id" element={< PageStudent/>} /> 
        {/* InformationDriver */}
    </Routes>
  </BrowserRouter>
  );
}

export default App;
