import React from "react";
import { Col, Row ,Container} from "react-bootstrap";
import { BsFillTelephoneFill } from "react-icons/bs";
import { AiFillHome, AiTwotoneMail } from "react-icons/ai";

import "../style/footer.css";
const Footer = () => {
  return (
    <div className="parent text-light">
      <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 1440 320">
        <path
          fill="#29333a"
          fill-opacity="1"
          d="M0,96L120,106.7C240,117,480,139,720,138.7C960,139,1200,117,1320,106.7L1440,96L1440,320L1320,320C1200,320,960,320,720,320C480,320,240,320,120,320L0,320Z"
        ></path>
      </svg>
      {/* <Row className="right      text-end">
        <Col xs={6} sm={6} lg={12} className="d-flex">
          <BsFillTelephoneFill />
          <p className="ms-3"> +966543027494 </p>
        </Col>
        <Col xs={6} sm={6} lg={12} className="d-flex">
          <AiFillHome />
          <p className="ms-3">Riyadh</p>
        </Col>
        <Col sm={12} className="d-flex text-center">
          <AiTwotoneMail />
          <p className="ms-3">email@gmail.com</p>
        </Col>
      </Row> */}
      <Container  id="header"style={{ zIndex: "999", position: "absolute",  left: "3%" , top: "81%" ,
    }}>
      <div className=" ms-5  text-center ">
    
        <p className="fw-bold w-50" className="text-center ">
          Lorem ipsum dolor sit amet consectetur, adipisicing elit. Minima
        </p>
        
      </div>
    </Container>
      
    </div>
  );
};

export default Footer;
