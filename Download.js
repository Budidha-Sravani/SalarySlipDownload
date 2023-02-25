

import React  from 'react'
import  jsPDF from 'jspdf';
import  html2canvas from 'html2canvas';
//import { useParams } from 'react-router-dom'
//import { useEffect } from 'react';
//import axios from 'axios';
//export default function Download() {
    const Download=({file,setFile}) => {
    const handlePdf = () => {
      const input = document.getElementById(setFile);
    
       html2canvas(input)
          .then((canvas) => {
           const imgData = canvas.toDataURL('image/png');
               const pdf = new jsPDF("p", "mm", "a3");
                var width = pdf.internal.pageSize.getWidth();
                var height = pdf.internal.pageSize.getHeight();
    
               pdf.addImage(imgData, 'JPEG', 0, 0,width,height);
               pdf.save(`${file}`);
            });
    };
  //  const [emp,setData]=useState(
      //  {
         //  id:"",
         //  name:"",
        //   projectname:"",
        //   designation:"",
        //   email:"",
        //   phonenumber:null,
            
      //  }
   // )
    //const {id}=useParams();
    //useEffect(()=>{
       //viewEmploy();
   //},[])
    //const viewEmploy=async () =>{
       //const result=await axios.get(`http://localhost:8080/api/v1/get/${"A501"}`);
     // setData(result.data);
  
     return (
    <div>
      
      <button onClick={handlePdf}>Download</button> 
    </div>
     );
};
export default Download;
