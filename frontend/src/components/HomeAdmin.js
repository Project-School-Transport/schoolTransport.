
  import { useState } from "react";
  import Popup from 'reactjs-popup';

function HomeAdmin() {
  const [toggleState, setToggleState] = useState(1);

  const toggleTab = (index) => {
    setToggleState(index);
  };

  return (
    <div className="container">
      <div className="bloc-tabs">
        <button
          className={toggleState === 1 ? "tabs active-tabs" : "tabs"}
          onClick={() => toggleTab(1)}
        >
         My profile 
        </button>
        <button
          className={toggleState === 2 ? "tabs active-tabs" : "tabs"}
          onClick={() => toggleTab(2)}
        >
          Students
        </button>
        <button
          className={toggleState === 3 ? "tabs active-tabs" : "tabs"}
          onClick={() => toggleTab(3)}
        >
          Drivers
        </button>
      </div>

      <div className="content-tabs">
        <div
          className={toggleState === 1 ? "content  active-content" : "content"}
        >
          <h2>Account Information</h2>
          
          <br/> 
          
          <br/> 
          <form>
  <label for="fname"> name:</label>
  <input type="text" id="fname" name="fname" value="School girle"/> <br/>    <br/> 
  <label for="fname"> Email:</label>
  <input type="email" id="email" name="email" value="School @gmail.com"/> <br/>    <br/> 
  <label for="lname">password:</label>
  <input type="password" id="password" name="password"/> <br/>    <br/> 
  <input type="submit" value="Submit"/>
</form>

        </div>

        <div
          className={toggleState === 2 ? "content  active-content" : "content"}
        >

<Popup trigger={<button className="button"> Add Students  </button>} modal>
    <span> Add Students </span>
    <form>
   
  <label for="fname"> Email:</label>
  <input type="email" id="email" name="email" /> <br/>    <br/> 
  <label for="lname">password:</label>
  <input type="password" id="password" name="password"/> <br/>    <br/> 
  <label for="fname"> Driver:</label>

  <input type="radio" id="html" name="fav_language" value="Deiver1"/>
  <label for="html">Deiver1</label>
  <input type="radio" id="css" name="fav_language" value="Deiver2"/>
  <label for="css">Deiver2</label> <br/><br/><br/>
  <input type="submit" value="Submit"/>
</form>


  </Popup>

 
          <h2>All Students</h2>
          
          <table>
  <tr>
    <th>id</th>
    <th>Name</th>
    <th>Driver</th>
  </tr>
  <tr>
    <td>Alfreds Futterkiste</td>
    <td>Maria Anders</td>
    <td>Germany</td>
  </tr>
  <tr>
    <td>Centro comercial Moctezuma</td>
    <td>Francisco Chang</td>
    <td>Mexico</td>
  </tr>
  </table>
        </div>

        <div
          className={toggleState === 3 ? "content  active-content" : "content"}
        >
<Popup trigger={<button className="button"> Add Driver  </button>} modal>
    <span> Add Driver </span>
    <form>
   
  <label for="fname"> Email:</label>
  <input type="email" id="email" name="email" /> <br/>    <br/> 
  <label for="lname">password:</label>
  <input type="password" id="password" name="password"/> <br/>    <br/> 
  <label for="fname"> plat Number:</label>
  <input type="text" id="email" name="platNumber" /> <br/>    <br/> 
  <label for="fname"> phone number:</label>
  <input type="text" id="email" name="platNumber" /> <br/>    <br/> 
 <br/><br/><br/>
  <input type="submit" value="Submit"/>
</form>


  </Popup>


          <br/> <br/> <br/>
          <h2>All Drivier</h2>
          

<table>
  <tr>
    <th>id </th>
    <th>Name </th>
    
  </tr>
  <tr>
    <td>Alfreds Futterkiste</td>
    <td>Maria Anders</td>
    
  </tr>
  <tr>
    <td>Centro comercial Moctezuma</td>
    <td>Francisco Chang</td>
   
  </tr>
  </table>
        </div>
      </div>
    </div>
  );
}

export default HomeAdmin;