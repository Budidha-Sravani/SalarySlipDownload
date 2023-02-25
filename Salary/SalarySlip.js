//import React from 'react';
import './Salary.css';
import YBlogo from './YBlogo.jpg';
const SalarySlip = ({ date, toAddress }) => {
      
  return (
      
    <div className='Distance' >
    <div style={{ textAlign: 'left', padding: '80px' }}>
    <center>
        <img     src={YBlogo} height="150" width="auto" />
      </center>
      <h4 >SalarySlip</h4>
      <>{new Date().toLocaleDateString()}</>
      <p></p>
      <div>
<table>  
      <thead>
       <tr>
            <th className='Salary1'><b>Your Bank</b></th>
        </tr>
        
        <tr>
            <th className='Salary1'><b>Salary Slip for [month] [year]</b>     </th>
            </tr>
            </thead>
            <table>
                <tr>
                <td>
                    <div className='table'>
                    Name 
                    <div className='Spacing'></div>     
                    </div>
                    </td>
                <td>
                    <div className='table'>
                    Department
                    <div className='Spacing'></div>
                    </div>
                    </td>
                </tr>
                <tr>
                <td>
                    <div className='table'>
                    Emp No.
                    <div className='Spacing'></div>
                    </div>
                    </td>
                <td>
                    <div className='table'>
                    Bank Name
                    <div className='Spacing'></div>
                    </div>
                    </td>
                </tr>
                <tr>
                <td>
                    <div className='table'>
                    Designation  
                    <div className='Spacing'></div>    
                    </div>
                    </td>
                <td>
                    <div className='table'>
                    A/c No.
                    <div className='Spacing'></div>
                    </div>
                    </td>
                </tr>
            </table>
            <table>
            <thead>
            <tr>
          <th>Earnings</th>
          <th>Deductions</th>
        </tr>
            </thead>
            
                <tr>
                    
                    <td>
                        <div className='table'>
                        Basic Salary
                        <div className='Spacing'> 14,784.00</div>
                        </div>
                    </td>
                    <td>
                        <div className='table'>
                         EPF
                         <div className='Spacing'>1,774.00</div>
                        </div>
                        </td>
                </tr>
                <tr>
                    <td>
                        <div className='table'>
                            House Rent Allowences
                            <div className='Spacing1'> 5,914.00</div>
                            </div>
                        </td>

                    <td>
                        <div className='table'>
                            Health Insurance
                            <div className='Spacing1'> 912.00</div>
                        </div>
                        </td>
                </tr>
                <tr>
                    <td>
                        <div className='table' >
                        Conveyance Allowances
                        <div className='Spacing1'>1,232.00</div>
                        </div>
                        </td>
                    <td>
                        <div className='table' >
                        Professional Tax
                        <div className='Spacing1'> 200.00</div>
                        </div>
                        </td>
                </tr>
                <tr>
                    <td>
                        <div className='table'>
                        Medical Allowances
                        <div className='Spacing2'> 600.00</div>
                        </div>
                        </td>
                    <td>TDS</td>
                </tr>
                <tr>
                    <td>
                        <div className='table'>
                        Special Allowances
                        <div className='Spacing2'>1,700.00</div>
                        </div>
                        </td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <div className='table'>
                        Gross Salary
                        <div className='Spacing'>24,230.00</div>
                        </div>
                        </td>
                    <td>
                        <div className='table'>
                        Total Deductions
                        <div className='Spacing1' >2,886.00</div>
                        </div>
                        </td>
                </tr>
                <thead>
            <tr>
          <th>Net Pay</th>
          <th> 21,344.00</th>
          
        </tr>
            </thead>
            </table>
    </table>
      </div>
      
  
    </div>
    </div>
  );
};


export default SalarySlip;