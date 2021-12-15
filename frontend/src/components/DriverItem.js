import { useState, useEffect } from "react";
import axios from "axios";

function DriverItem({drivers, setDrivers }) {
    const [driver, setDriver] = useState({
        fname: '',
        lname: '',
        passWord: '',
        phoneNumber: '',
        platNumber: '',
        school:{
          id:1
      }
     });;

     const addDriver=(event)=>{
        event.preventDefault();
     
        const data = {
            fname: driver.fname,
            lname: driver.lname,
            passWord: driver.passWord,
            phoneNumber: " ",
            platNumber: " ",
            school:{
                id:1
            }
        }
    
        axios
        .post(`http://localhost:8080/drive/`,data)
        .then((res) => {
          console.log(res.data);
         
        })
        .catch((err) => {
          console.log(err);
        });
    }

    const deleteDriver=()=>{
        console.log(" this"+driver.id);
        axios
      .delete(`http://localhost:8080/drive/${driver.id}`)
      .then((res) => {
        setDrivers((drivers) => {
          return drivers.filter((element) => {
            return element.id !== driver.id;
          });
        });
      })
      .catch((err) => {
        console.log(err);
      });
  };
       
    
    

    return (
        < div className="displayStudent">
  <form onSubmit={addDriver}>
      <input
        type="text"
        placeholder="fName"
        value={driver.fname}
        onChange={e => {
            setDriver({ ...driver, fname: e.target.value });
        }}
      />
 <input
        type="text"
        placeholder="lName"
        value={driver.lname}
        onChange={e => {
            setDriver({ ...driver, lname: e.target.value });
        }}
      />
       <input
        type="passWord"
        placeholder="passWord"
        value={driver.passWord}
        onChange={e => {
            setDriver({ ...driver, passWord: e.target.value });
        }}
      />
      {/* <Location currentPosition={currentPosition}  setCurrentPosition ={setCurrentPosition}/> */}
      <button>Adddriver</button>
    </form>


        <h1> {driver.fname + " " + driver.lname}</h1>
        <button onClick={deleteDriver}> Delete </button>
                    
        </div >
     
    );
  }
  
  export default DriverItem;