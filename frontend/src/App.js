import "./App.css";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Admin from "./components/Admin";
import Driver from "./components/AdminDriver";
import Student from "./components/Student";
import LocationAllStudent from './components/LocationAllStudent'
import AdminDriver from './components/AdminDriver'
function App() {
  return (
    <BrowserRouter>
    <Routes>
      <Route exact path="/" element={<Admin />} />
      <Route exact path="/driver" element={<Driver />} />
      <Route exact path="/student" element={<Student />} />
      <Route exact path="/locationAllStudent" element={<LocationAllStudent />} />
      <Route exact path="/adminDriver" element={<AdminDriver />} />
      AdminDriver

    </Routes>
  </BrowserRouter>
  );
}

export default App;
