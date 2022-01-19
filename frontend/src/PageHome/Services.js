import React from "react";
import { Col, Container, Row } from "react-bootstrap";
import "../style/services.css";

import {
  FaLocationArrow,
  FaSistrix,
  FaHubspot,
  FaBusinessTime,
} from "react-icons/fa";
const Services = () => {
  return (
    <> 
   
    <Container className="mt-5  z-index3" id="services" style={{ padding: "91px", top: "60%" }}>
    <div className=" ms-5  text-center ">
        <h1>Features </h1>
        <hr/>
        </div>
      <Row>
        <Col sm={12} md={5} lg={3} className="text-center   cards m-2">
          <FaLocationArrow size={"2rem"} color={"#09cab8"} className="mb-3" />
          <h4>Time Management</h4>
          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam alias
            rerum ad blanditiis at provident ipsam ea atque sed consectetur
            deserunt aspernatur magni, animi, odit, cumque voluptate nobis quis
            cupiditate.
          </p>
        </Col>
        <Col sm={12} md={5} lg={3} className="text-center cards m-2">
          <FaSistrix size={"2rem"} color={"#09cab8"} className="mb-3" />
          <h4>Time Management</h4>

          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam alias
            rerum ad blanditiis at provident ipsam ea atque sed consectetur
            deserunt aspernatur magni, animi, odit, cumque voluptate nobis quis
            cupiditate.
          </p>
        </Col>
        <Col sm={12} md={5} lg={3} className="text-center m-2 cards">
          <FaHubspot size={"2rem"} color={"#09cab8"} className="mb-3" />
          <h4>Time Management</h4>

          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam alias
            rerum ad blanditiis at provident ipsam ea atque sed consectetur
            deserunt aspernatur magni, animi, odit, cumque voluptate nobis quis
            cupiditate.
          </p>
        </Col>
        <Col sm={12} md={5} lg={3} className="text-center m-2  cards">
          <FaBusinessTime size={"2rem"} color={"#09cab8"} className="mb-3" />
          <h4>Time Management</h4>

          <p>
            Lorem ipsum dolor sit amet consectetur adipisicing elit. Quam alias
            rerum ad blanditiis at provident ipsam ea atque sed consectetur
            deserunt aspernatur magni, animi, odit, cumque voluptate nobis quis
            cupiditate.
          </p>
        </Col>
      </Row>
     
    </Container>
    </>
  );
};

export default Services;
