import React from "react";
import { Container } from "react-bootstrap";

export const About = () => {
  return (
      <>
      
    <Container  id="about"style={{ zIndex: "999", position: "absolute", top: "105%" }}>
      <div className=" ms-5  text-center ">
        <h1>About  </h1>
        <hr className="hrAbout"/>
        <p className="fw-bold w-50" className="text-center ">
          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Minima
          ratione adipisci laborum ipsam. Sed inventore vel eligendi? Nam,
          veniam alias deserunt voluptates ad est quis tenetur quia eveniet
          tempora provident!
        </p>
        
      </div>
    </Container>
    <Container  id="header"style={{ zIndex: "999", position: "absolute", top: "35%" ,
    left: "-24%"}}>
      <div className=" ms-5  text-center ">
        <h1>school Transport  </h1>
        <p className="fw-bold w-50" className="text-center ">
          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Minima
        </p>
        
      </div>
    </Container>
    </>
  );
};
export default About;