import 'bootstrap/dist/css/bootstrap.css'
import {Nav, Navbar} from 'react-bootstrap'
import './App.css';
import './Person.js'
import Person from './Person.js';
import { useEffect, useState } from 'react';

function App() {

  const [doctors , setDoctors] = useState([{
    address:"hellomaroc",email:"black@kestar.com",password:"maroc2020",privateKey:"hellomaroc"}
]);
useEffect(() => {
    fetch("http://localhost:8080/api/doctors").then(res=>{
        return res.json(); 
    }).then(data=>{
      console.log(data) ;
      setDoctors(data);
    })
}, []);
  return (
    <div className="App">
     <Navbar bg="dark" variant='dark'>
      <Navbar.Brand >
        <div className="logo">
          Prescription

        </div>
      </Navbar.Brand>
     </Navbar>
    
    <div className="corps">
      {
        doctors.map((doctor)=> (

            <Person title={doctor.email} text={"address : " +doctor.address}></Person>
        ))
      } 
     </div>
    </div>
  );
}

export default App;
