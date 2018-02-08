<%-- 
    Document   : Upload_Products
    Created on : 29 Dec, 2017, 3:10:02 PM
    Author     : MD. SALMAN
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "cc" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>

        <title>Upload-Products Page</title>
        <style>
            * {
                -webkit-box-sizing: border-box;
                -moz-box-sizing: border-box;
                box-sizing: border-box;
            }


            .page-wrap {
                max-width: 75rem;
                margin: 0 auto;
            }


            input:focus ~ label, textarea:focus ~ label, input:valid ~ label, textarea:valid ~ label {
                font-size: 0.75em;
                color: red;
                top: -2.50rem;
                -webkit-transition: all 0.125s ease;
                transition: all 0.125s ease;
            }

            .styled-input {
                float: left;
                width: 33.3333%;
                margin: 2rem 0 1rem;
                position: relative;
            }

            .styled-input label {
                color: #000;
                padding: 1rem;
                position: absolute;
                top: 0;
                left: 0;
                -webkit-transition: all 0.25s ease;
                transition: all 0.25s ease;
                pointer-events: none;
            }

            .styled-input.wide { width: 100%; }

            input,
            textarea {
                padding: 1rem 1rem;
                border: 1;
                width: 100%;
                font-size: 1rem;
            }

            input ~ span,
            textarea ~ span {
                display: block;
                width: 0;
                height: 3px;
                background: #8e44ad;
                position: absolute;
                bottom: 0;
                left: 0;
                -webkit-transition: all 0.125s ease;
                transition: all 0.125s ease;
            }

            input:focus,
            textarea:focus { outline: 0; }

            input:focus ~ span,
            textarea:focus ~ span {
                width: 100%;
                -webkit-transition: all 0.075s ease;
                transition: all 0.075s ease;
            }

            .panel-default{
                background: rgba(255, 255, 255, 0.5);
            }
            .panel-default .panel-heading{
                background: rgba(255, 255, 255, 0.9);
            }
            .panel-default .panel-body{
                background: rgba(255, 255, 255, 0.0);
            }
        </style>

    </head>
    <body>
        <cc:import url = "adminnavbar.jsp"/>
        <div class="container-fluid" style="margin-top: 775px;">
            <div class="row">
                <div class="col-md-12">          
                    <div class="carousel-caption">

                        <div class="panel panel-default">
                            <div class="panel-heading" >
                                <ul class="nav nav-tabs" id="mytabs">
                                    <li class="active"><a href="#tab1" style="color:darkslateblue"><b>Flight Details</b></a></li>
                                </ul>
                            </div>

                            <div class="panel-body">
                                <div class="tab-content clearfix">
                                    <div class="tab-pane fade in active" id="tab1">
                                        <form style="color:#000" method="POST" action="FlightUpload" enctype="multipart/form-data">
                                            <div class="styled-input">
                                                <input type="text" required name="flightName"/>
                                                <label>Flight Name</label>
                                            </div>
                                            <div class="styled-input">
                                                <input type="number" required name="flightNumber"/>
                                                <label>Flight No.</label>
                                            </div>

                                            <div class="styled-input">
                                                <input type="plain" required list="sts" name="flightState" id="select1"/>
                                                <label>State</label>
                                                <span><datalist id="sts">
                                                        <option value="Andaman-Nicobar-Islands"></option>
                                                        <option value="Andhra-Pradesh">
                                                        <option value="Arunachal-Pradesh">
                                                        <option value="Assam">
                                                        <option value="Bihar">
                                                        <option value="Chhattisgarh">
                                                        <option value="Daman-and-Diu">
                                                        <option value="Delhi">
                                                        <option value="Goa">
                                                        <option value="Gujarat">
                                                        <option value="Haryana">
                                                        <option value="Himachal-Pradesh">
                                                        <option value="Jammu-and-Kashmir">
                                                        <option value="Jharkhand">
                                                        <option value="Karnataka">
                                                        <option value="Kerala">
                                                        <option value="Lakshadweep">
                                                        <option value="Madhya-Pradesh">
                                                        <option value="Maharashtra">
                                                        <option value="Manipur">
                                                        <option value="Meghalaya">
                                                        <option value="Mizoram">
                                                        <option value="Nagaland">
                                                        <option value="Odisha">
                                                        <option value="Pondicherry">
                                                        <option value="Punjab">
                                                        <option value="Rajasthan">
                                                        <option value="Sikkim">
                                                        <option value="Tamil-Nadu">
                                                        <option value="Telangana">
                                                        <option value="Tripura">
                                                        <option value="Uttar-Pradesh">
                                                        <option value="Uttarakhand">
                                                        <option value="West-Bengal">
                                                    </datalist></span> </div>

                                            <div class="styled-input">
                                                <input type="plain" required list="frm" name="flightFrom"/>
                                                <label>From</label>
                                                <span><datalist id="frm">
                                                        <option value="Andhra Pradesh">
                                                        <option value="Arunachal Pradesh">
                                                        <option value="Assam">
                                                        <option value="Bihar">
                                                        <option value="Chhattisgarh">
                                                        <option value="Delhi">
                                                        <option value="Goa">
                                                        <option value="Gujarat">
                                                        <option value="Haryana">
                                                        <option value="Himachal Pradesh">
                                                        <option value="Jammu and Kashmir">
                                                        <option value="Jharkhand">
                                                        <option value="Karnataka">
                                                        <option value="Kerala">
                                                        <option value="Madhya Pradesh">
                                                        <option value="Maharashtra">
                                                        <option value="Manipur">
                                                        <option value="Meghalaya">
                                                        <option value="Mizoram">
                                                        <option value="Nagaland">
                                                        <option value="Odisha">
                                                        <option value="Punjab">
                                                        <option value="Rajasthan">
                                                        <option value="Sikkim">
                                                        <option value="Tamil Nadu">
                                                        <option value="Telangana">
                                                        <option value="Tripura">
                                                        <option value="Uttar Pradesh">
                                                        <option value="Uttarakhand">
                                                        <option value="West Bengal">
                                                    </datalist></span> </div>

                                            <div class="styled-input">
                                                <input type="plain" required list="oto" name="flightTo"/>
                                                <label>To</label>
                                                <span><datalist id="oto">
                                                        <option value="Andhra Pradesh">
                                                        <option value="Arunachal Pradesh">
                                                        <option value="Assam">
                                                        <option value="Bihar">
                                                        <option value="Chhattisgarh">
                                                        <option value="Delhi">
                                                        <option value="Goa">
                                                        <option value="Gujarat">
                                                        <option value="Haryana">
                                                        <option value="Himachal Pradesh">
                                                        <option value="Jammu and Kashmir">
                                                        <option value="Jharkhand">
                                                        <option value="Karnataka">
                                                        <option value="Kerala">
                                                        <option value="Madhya Pradesh">
                                                        <option value="Maharashtra">
                                                        <option value="Manipur">
                                                        <option value="Meghalaya">
                                                        <option value="Mizoram">
                                                        <option value="Nagaland">
                                                        <option value="Odisha">
                                                        <option value="Punjab">
                                                        <option value="Rajasthan">
                                                        <option value="Sikkim">
                                                        <option value="Tamil Nadu">
                                                        <option value="Telangana">
                                                        <option value="Tripura">
                                                        <option value="Uttar Pradesh">
                                                        <option value="Uttarakhand">
                                                        <option value="West Bengal">
                                                    </datalist></span> </div>

                                            <div class="styled-input">
                                                <input type="text" name="flightDistance">
                                                <label>Distance</label>
                                                <span></span> </div>


                                            <div class="styled-input">
                                                <input type="number" required name="flightETP"/>
                                                <label>Economic Ticket Price</label>
                                                <span></span> </div>

                                            <div class="styled-input">
                                                <input type="number" required name="flightBTP"/>
                                                <label>Business Ticket Price</label>
                                                <span></span> </div>

                                            <div class="styled-input">
                                                <input type="date" required name="flightDate" maxlength="6" value = "2017-02-05"/>
                                                <label>Date</label>
                                                <span></span> </div>

                                            
                                            <div class="styled-input">
                                                <input type="number" required name="flightSeatRows">
                                                <label>Seat Rows</label>
                                                <span></span> </div>

                                            <div class="styled-input">
                                                <input type="text" required name="flightSeatCols">
                                                <label>Seat Cols</label>
                                                <span></span> </div>
                                            
                                            <div class="styled-input">
                                                <input type="time" required name="flightDepature"/>
                                                <label>DEPARTURE</label>
                                            </div>
                                            <div class="styled-input">
                                                <input type="time" required name="flightArrival"/>
                                                <label>ARRIVAL</label>
                                            </div>
                                            <div class="styled-input">
                                                <input type="number" required name="flightDuration">
                                                <label>Duration</label>
                                                <span></span> </div>

                                            <div class="styled-input" style="margin-right: 250px; margin-top: 20px;">
                                                <input type="file" name="flightImage" multiple="multiple" required="required">
                                                <label>Upload Flight Image</label>
                                                <span></span> </div>


                                            <div class="listgroup">
                                                <label>Select Runways</label>
                                                <sub style="font-size:13px; color:red;">
                                                    <select class="selectpicker" id="select2" name="flightRunway">
                                                        <option></option>
                                                        <optgroup label="ALL RUNWAYS">
                                                        <optgroup label="Andaman & Nicobar Islands">
                                                            <option value="Andaman-Nicobar-Islands">Car Nicobar Air Force Base</option>
                                                            <option value="Andaman-Nicobar-Islands">Campbell Bay Airport</option>
                                                            <option value="Andaman-Nicobar-Islands">NAS Shibpur</option>
                                                            <option value="Andaman-Nicobar-Islands">Veer Savarkar International Airport</option>
                                                        </optgroup>    
                                                        <optgroup label="Andhra Pradesh">        
                                                            <option value="Andhra-Pradesh">Kadapa Airport</option>
                                                            <option value="Andhra-Pradesh">Kurnool Airport</option>
                                                            <option value="Andhra-Pradesh">Nagarjuna Sagar Airport</option>
                                                            <option value="Andhra-Pradesh">Nellore Airport</option>
                                                            <option value="Andhra-Pradesh">Sri Sathya Sai Airport</option>
                                                            <option value="Andhra-Pradesh">Rajahmundry Airport</option>
                                                            <option value="Andhra-Pradesh">Srikakulam Airport</option>
                                                            <option value="Andhra-Pradesh">Tirupati Airport</option>
                                                            <option value="Andhra-Pradesh">Vijayawada Airport</option>
                                                            <option value="Andhra-Pradesh">Visakhapatnam Airport</option>
                                                            <option value="Andhra-Pradesh">Bhogapuram Airport</option>

                                                        </optgroup>
                                                        <optgroup label="Arunachal Pradesh">
                                                            <option value="Arunachal-Pradesh">Along Airport</option>
                                                            <option value="Arunachal-Pradesh">Daporijo Airport</option>
                                                            <option value="Arunachal-Pradesh">Itanagar Airport</option>
                                                            <option value="Arunachal-Pradesh">Pasighat Airport</option>	
                                                            <option value="Arunachal-Pradesh">Tezu Airport</option>	
                                                            <option value="Arunachal-Pradesh">Ziro Airport</option>	
                                                        </optgroup>
                                                        <optgroup label="Assam">
                                                            <option value="Assam">Chabua Air Force Station</option>
                                                            <option value="Assam">Rupsi Airport</option>
                                                            <option value="Assam">Dibrugarh Airport</option>
                                                            <option value="Assam">Sookerating Air Force Station</option>
                                                            <option value="Assam">Lokpriya Gopinath Bordoloi International Airport</option>
                                                            <option value="Assam">Jorhat Airport</option>
                                                            <option value="Assam">Lilabari Airport</option>
                                                            <option value="Assam">Shella Airport</option>
                                                            <option value="Assam">Silchar Airport</option>
                                                            <option value="Assam">Tezpur Airport</option>                                                         
                                                        </optgroup>                                                        
                                                        <optgroup label="Bihar">
                                                            <option value="Bihar">Bihta Air Force Station</option>
                                                            <option value="Bihar">Bhagalpur Airport</option>
                                                            <option value="Bihar">Darbhanga Airport</option>
                                                            <option value="Bihar">Gaya International Airport</option>
                                                            <option value="Bihar">Jogbani Airport</option>
                                                            <option value="Bihar">Munger Airport</option>
                                                            <option value="Bihar">Muzaffarpur Airport</option>
                                                            <option value="Bihar">Jay Prakash Narayan International Airport</option>
                                                            <option value="Bihar">Purnea Airport</option>
                                                            <option value="Bihar">Raxaul Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Chhattisgarh">
                                                            <option value="Chhattisgarh">Ambikapur Airport</option>
                                                            <option value="Chhattisgarh">Bhilai Airport</option>
                                                            <option value="Chhattisgarh">Bilaspur Airport</option>
                                                            <option value="Chhattisgarh">Jagdalpur Airport</option>
                                                            <option value="Chhattisgarh">Jashpur Airport</option>
                                                            <option value="Chhattisgarh">Korba Airport</option>
                                                            <option value="Chhattisgarh">Raigarh Airport</option>
                                                            <option value="Chhattisgarh">OP Jindal Airport</option>
                                                            <option value="Chhattisgarh">Swami Vivekananda Airport</option>                                                           
                                                        </optgroup>
                                                        <optgroup label="Daman and Diu">
                                                            <option value="Daman-and-Diu">Daman Airport</option>
                                                            <option value="Daman-and-Diu">Diu Airport</option>
                                                        </optgroup>    
                                                        <optgroup label="Delhi">
                                                            <option value="Delhi">Indira Gandhi Airport</option>
                                                            <option value="Delhi">Safdarjung Airport</option>
                                                        </optgroup>    
                                                        <optgroup label="Goa">
                                                            <option value="Goa">Goa International Airport</option>
                                                            <option value="Goa">Mopa Airport</option>
                                                        </optgroup>    
                                                        <optgroup label="Gujarat">
                                                            <option value="Gujarat">Sardar Vallabhbhai Patel International Airport</option>
                                                            <option value="Gujarat">Amreli Airport</option>
                                                            <option value="Gujarat">Bhavnagar Airport</option>
                                                            <option value="Gujarat">Bhuj Airport</option>
                                                            <option value="Gujarat">Dholera International Airport</option>
                                                            <option value="Gujarat">Jamnagar Airport</option>
                                                            <option value="Gujarat">Kandla Airport</option>
                                                            <option value="Gujarat">Keshod Airport</option>
                                                            <option value="Gujarat">Mehsana Airport</option>
                                                            <option value="Gujarat">Mundra Airport</option>
                                                            <option value="Gujarat">Palanpur Airport</option>
                                                            <option value="Gujarat">Porbandar Airport</option>
                                                            <option value="Gujarat">Rajkot Airport</option>
                                                            <option value="Gujarat">Rajkot Greenfield Airport</option>
                                                            <option value="Gujarat">Surat Airport</option>
                                                            <option value="Gujarat">Vadodara Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Haryana">
                                                            <option value="Haryana">Ambala Air Force Station</option>
                                                            <option value="Haryana">Bhiwani Airport</option>
                                                            <option value="Haryana">Gurugram Airstrip</option>
                                                            <option value="Haryana">Hisar Airport</option>
                                                            <option value="Haryana">Karnal Airport</option>
                                                            <option value="Haryana">Narnaul Airport</option>
                                                            <option value="Haryana">Pinjore Airport</option>
                                                            <option value="Haryana">Sirsa Air Force Station</option>
                                                        </optgroup>    
                                                        <optgroup label="Himachal Pradesh">
                                                            <option value="Himachal-Pradesh">Gaggal Airport</option>
                                                            <option value="Himachal-Pradesh">Bhuntar Airport</option>
                                                            <option value="Himachal-Pradesh">Shimla Airport</option>
                                                        </optgroup>    
                                                        <optgroup label="Jammu & Kashmir">
                                                            <option value="Jammu-and-Kashmir">Jammu Airport</option>
                                                            <option value="Jammu-and-Kashmir">Kargil Airport</option>
                                                            <option value="Jammu-and-Kashmir">Kushok Bakula Rimpochhe Airport</option>
                                                            <option value="Jammu-and-Kashmir">Srinagar International Airport</option>
                                                            <option value="Jammu-and-Kashmir">Thoise Airbase</option>
                                                        </optgroup>    
                                                        <optgroup label="Jharkhand">
                                                            <option value="Jharkhand">Bokaro Airport</option>
                                                            <option value="Jharkhand">Chakulia Airport</option>
                                                            <option value="Jharkhand">Deoghar Airport</option>
                                                            <option value="Jharkhand">Dhanbad Airport</option>
                                                            <option value="Jharkhand">Sonari Airport</option>
                                                            <option value="Jharkhand">Birsa Munda Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Karnataka">
                                                            <option value="Karnataka">Belgaum Airport</option>
                                                            <option value="Karnataka">Bellary Airport</option>
                                                            <option value="Karnataka">Kempegowda International Airport</option>
                                                            <option value="Karnataka">HAL Airport</option>
                                                            <option value="Karnataka">Yelahanka Air Force Station</option>
                                                            <option value="Karnataka">Jakkur Airfield</option>
                                                            <option value="Karnataka">Bidar Airport</option>
                                                            <option value="Karnataka">Bijapur Airport</option>
                                                            <option value="Karnataka">Challakere Airport</option>
                                                            <option value="Karnataka">Gulbarga Airport</option>
                                                            <option value="Karnataka">Harihar Airport</option>
                                                            <option value="Karnataka">Hassan Airport</option>
                                                            <option value="Karnataka">Hubli Airport</option>
                                                            <option value="Karnataka">Karwar Airport</option>
                                                            <option value="Karnataka">Koppal Airport</option>
                                                            <option value="Karnataka">Mangalore International Airport</option>
                                                            <option value="Karnataka">Mysore Airport</option>
                                                            <option value="Karnataka">Shimoga Airport</option>
                                                            <option value="Karnataka">Jindal Vijaynagar Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Kerala">
                                                            <option value="Kerala">Kannur International Airport</option>
                                                            <option value="Kerala">Cochin International Airport</option>
                                                            <option value="Kerala">INS Garuda</option>
                                                            <option value="Kerala">Kollam Airport</option>
                                                            <option value="Kerala">Palakkad Airport</option>
                                                            <option value="Kerala">Sabarigiri International Airport</option>
                                                            <option value="Kerala">Thiruvambady International Airport</option>
                                                            <option value="Kerala">Calicut International Airport</option>
                                                            <option value="Kerala">Thiruvananthapuram International Airport</option>
                                                        </optgroup>    
                                                        <optgroup label="Lakshadweep">
                                                            <option value="Lakshadweep">Agatti Airport</option>                                                            
                                                        </optgroup>    
                                                        <optgroup label="Madhya-Pradesh">
                                                            <option value="Madhya-Pradesh">Raja Bhoj Airport</option>
                                                            <option value="Madhya-Pradesh">Chhindwara Airport</option>
                                                            <option value="Madhya-Pradesh">Daboh Airport</option>
                                                            <option value="Madhya-Pradesh">Gwalior airport</option>
                                                            <option value="Madhya-Pradesh">Devi Ahilyabai Holkar International Airport</option>
                                                            <option value="Madhya-Pradesh">Jabalpur Airport</option>
                                                            <option value="Madhya-Pradesh">Khajuraho Airport</option>
                                                            <option value="Madhya-Pradesh">Khandwa Airport</option>
                                                            <option value="Madhya-Pradesh">Panna Airport</option>
                                                            <option value="Madhya-Pradesh">Dhana Airport</option>
                                                            <option value="Madhya-Pradesh">Satna Airport</option>
                                                            <option value="Madhya-Pradesh">Guna Airstrip</option>
                                                            <option value="Madhya-Pradesh">Ujjain Airstrip</option>

                                                        </optgroup>  
                                                        <optgroup label="Maharashtra">
                                                            <option value="Maharashtra">Aamby Valley Airstrip</option>
                                                            <option value="Maharashtra">Akola Airport</option>
                                                            <option value="Maharashtra">Amravati Airport</option>
                                                            <option value="Maharashtra">Aurangabad Airport</option>
                                                            <option value="Maharashtra">Baramati Airport</option>
                                                            <option value="Maharashtra">Chandrapur Airport</option>
                                                            <option value="Maharashtra">Dhule Airport</option>
                                                            <option value="Maharashtra">Gondia Airport</option>
                                                            <option value="Maharashtra">Jalgaon Airport</option>
                                                            <option value="Maharashtra">Kalyan Airstrip</option>
                                                            <option value="Maharashtra">Karad Airport</option>
                                                            <option value="Maharashtra">Kolhapur Airport</option>
                                                            <option value="Maharashtra">Chhatrapati Shivaji International Airport</option>
                                                            <option value="Maharashtra">Juhu Aerodrome</option>
                                                            <option value="Maharashtra">Navi Mumbai International Airport</option>
                                                            <option value="Maharashtra">Dr. Babasaheb Ambedkar International Airport</option>
                                                            <option value="Maharashtra">Shri Guru Gobind Singh Ji Airport</option>
                                                            <option value="Maharashtra">Gandhinagar Airport</option>
                                                            <option value="Maharashtra">Ozar Airport</option>
                                                            <option value="Maharashtra">Osmanabad Airport</option>
                                                            <option value="Maharashtra">Parbhani Airport</option>
                                                            <option value="Maharashtra">Phaltan Landing Ground</option>
                                                            <option value="Maharashtra">Hadapsar Airport</option>
                                                            <option value="Maharashtra">Pune Airport</option>
                                                            <option value="Maharashtra">Ratnagiri Airport</option>
                                                            <option value="Maharashtra">Shirdi Airport</option>
                                                            <option value="Maharashtra">Shirpur Airstrip</option>
                                                            <option value="Maharashtra">Sindhudurg Airport</option>
                                                            <option value="Maharashtra">Solapur Airport</option>
                                                            <option value="Maharashtra">Yavatmal Airport</option>
                                                            <option value="Maharashtra">Latur Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Manipur">
                                                            <option value="Manipur">Koirengei Airstrip</option>
                                                            <option value="Manipur">Imphal International Airport</option>
                                                        </optgroup> 
                                                        <optgroup label="Meghalaya">    
                                                            <option value="Meghalaya">Shillong Airport</option>
                                                            <option value="Meghalaya">Baljek Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Mizoram">
                                                            <option value="Mizoram">Lengpui Airport</option>
                                                        </optgroup>   
                                                        <optgroup label="Nagaland">
                                                            <option value="Nagaland">Dimapur Airport</option> 
                                                        </optgroup>
                                                        <optgroup label="Odisha">
                                                            <option value="Odisha">Savitri Jindal Airport</option>
                                                            <option value="Odisha">Nuagaon Airport</option>
                                                            <option value="Odisha">Rasgovindpur Airstrip</option>
                                                            <option value="Odisha">Barbil Tonto Aerodrome</option>
                                                            <option value="Odisha">Utkela Airstrip</option>
                                                            <option value="Odisha">Biju Patnaik International Airport</option>
                                                            <option value="Odisha">Brahmapur Airport</option>
                                                            <option value="Odisha">Charbatia Air Base</option>
                                                            <option value="Odisha">Birasal Airstrip</option>
                                                            <option value="Odisha">Hirakud Airstrip</option>
                                                            <option value="Odisha">Jajpur Airstrip</option>
                                                            <option value="Odisha">Jeypore Airport</option>
                                                            <option value="Odisha">Jharsuguda Airport</option>
                                                            <option value="Odisha">Kendujhar Airstrip</option>
                                                            <option value="Odisha">Lanjigarh Airstrip</option>
                                                            <option value="Odisha">Nawapara Airport</option>
                                                            <option value="Odisha">Phulbani Airstrip</option>
                                                            <option value="Odisha">Rourkela Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Pondicherry">   
                                                            <option value="Pondicherry">Karaikal Airport</option>
                                                            <option value="Pondicherry">Pondicherry Airport</option>
                                                        </optgroup>   
                                                        <optgroup label="Punjab"> 
                                                            <option value="Punjab">Sri Guru Ram Dass Jee International Airport</option>
                                                            <option value="Punjab">Bathinda Airport</option>
                                                            <option value="Punjab">Adampur Airport</option>
                                                            <option value="Punjab">Sahnewal Airport</option>
                                                            <option value="Punjab">Chandigarh International Airport</option>
                                                            <option value="Punjab">Pathankot Airport</option>
                                                            <option value="Punjab">Patiala Airport</option>
                                                        </optgroup>    
                                                        <optgroup label="Rajasthan">    
                                                            <option value="Rajasthan">Kishangarh Airport</option>
                                                            <option value="Rajasthan">Nal Airport</option>
                                                            <option value="Rajasthan">Jaipur International Airport</option>
                                                            <option value="Rajasthan">Jaisalmer Airport</option>
                                                            <option value="Rajasthan">Kolana Airport</option>
                                                            <option value="Rajasthan">Jodhpur Airport</option>
                                                            <option value="Rajasthan">Kota Airport</option>
                                                            <option value="Rajasthan">Maharana Pratap Airport</option>
                                                        </optgroup>    
                                                        <optgroup label="Sikkim">     
                                                            <option value="Sikkim">Pakyong Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Tamil Nadu">
                                                            <option value="Tamil-Nadu">INS Rajali Naval Air Station</option>
                                                            <option value="Tamil-Nadu">Anna International Airport</option>
                                                            <option value="Tamil-Nadu">Tambaram Air Force Station</option>
                                                            <option value="Tamil-Nadu">Coimbatore International Airport</option>
                                                            <option value="Tamil-Nadu">Sulur Air Force Station</option>
                                                            <option value="Tamil-Nadu">Hosur Airport</option>
                                                            <option value="Tamil-Nadu">Madurai International Airport</option>
                                                            <option value="Tamil-Nadu">Neyveli Airport</option>
                                                            <option value="Tamil-Nadu">Salem Airport</option>
                                                            <option value="Tamil-Nadu">Thanjavur Air Force Station</option>
                                                            <option value="Tamil-Nadu">Tiruchirappalli International Airport</option>
                                                            <option value="Tamil-Nadu">Tuticorin Airport</option>
                                                            <option value="Tamil-Nadu">INS Parundu Naval Air Station</option>
                                                            <option value="Tamil-Nadu">Vellore Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Telangana">
                                                            <option value="Telangana">Begumpet Airport</option>
                                                            <option value="Telangana">Dundigul Air Force Academy</option>
                                                            <option value="Telangana">Hakimpet Air Force Station</option>
                                                            <option value="Telangana">Nadirgul Airport</option>
                                                            <option value="Telangana">Rajiv Gandhi International Airport</option>
                                                            <option value="Telangana">Kothagudem Airport</option>
                                                            <option value="Telangana">Nizamabad Airport</option>
                                                            <option value="Telangana">Ramagundam Airport</option>
                                                            <option value="Telangana">Warangal Airport</option>
                                                        </optgroup>
                                                        <optgroup label="Tripura">
                                                            <option value="Tripura">Agartala Airport</option>
                                                            <option value="Tripura">Kailashahar Airport</option>
                                                            <option value="Tripura">Khowai Airport</option> 
                                                        </optgroup>
                                                        <optgroup label="Uttarakhand">
                                                            <option value="Uttarakhand">Maa Ganga Airstrip</option>
                                                            <option value="Uttarakhand">Jolly Grant Airport</option>
                                                            <option value="Uttarakhand">Gauchar Airstrip</option>
                                                            <option value="Uttarakhand">Pantnagar Airport</option>
                                                            <option value="Uttarakhand">Naini Saini Airstrip</option>
                                                        </optgroup> 
                                                        <optgroup label="Uttar Pradesh">
                                                            <option value="Uttar-Pradesh">Agra Air Force Station</option>
                                                            <option value="Uttar-Pradesh">Akbarpur Airport</option>
                                                            <option value="Uttar-Pradesh">Aligarh Airport</option>
                                                            <option value="Uttar-Pradesh">Allahabad Airport</option>
                                                            <option value="Uttar-Pradesh">Azamgarh Airport</option>
                                                            <option value="Uttar-Pradesh">Bareilly Airport</option>
                                                            <option value="Uttar-Pradesh">Saifai airstrip</option>
                                                            <option value="Uttar-Pradesh">Faizabad Airport</option>
                                                            <option value="Uttar-Pradesh">Farrukhabad Airport</option>
                                                            <option value="Uttar-Pradesh">Ghazipur Airport</option>
                                                            <option value="Uttar-Pradesh">Hindon Air Force Station</option>
                                                            <option value="Uttar-Pradesh">Gorakhpur Airport</option>
                                                            <option value="Uttar-Pradesh">Jhansi Airport</option>
                                                            <option value="Uttar-Pradesh">Kanpur Civil Airport</option>
                                                            <option value="Uttar-Pradesh">IIT Kanpur Airport</option>
                                                            <option value="Uttar-Pradesh">Kanpur Airport</option>
                                                            <option value="Uttar-Pradesh">Kushinagar Airport</option>
                                                            <option value="Uttar-Pradesh">Kheri Airport</option>
                                                            <option value="Uttar-Pradesh">Chaudhary Charan Singh International Airport</option>
                                                            <option value="Uttar-Pradesh">Lucknow Air Force Station</option>
                                                            <option value="Uttar-Pradesh">Meerut Airport</option>
                                                            <option value="Uttar-Pradesh">Moradabad Airport</option>
                                                            <option value="Uttar-Pradesh">Raebareli Airport</option>
                                                            <option value="Uttar-Pradesh">Sarsawa Air Base</option>
                                                            <option value="Uttar-Pradesh">Shravasti Airport</option>
                                                            <option value="Uttar-Pradesh">Muirpur Airport</option>
                                                            <option value="Uttar-Pradesh">Sultanpur Airport</option>
                                                            <option value="Uttar-Pradesh">Lal Bahadur Shastri International Airport</option>
                                                        </optgroup>    
                                                        <optgroup label="West Bengal">
                                                            <option value="West-Bengal">Burnpur Airport</option>
                                                            <option value="West-Bengal">Balurghat Airport</option>
                                                            <option value="West-Bengal">Barrackpore Air Force Station</option>
                                                            <option value="West-Bengal">Behala Airport</option>
                                                            <option value="West-Bengal">Cooch Behar Airport</option>
                                                            <option value="West-Bengal">Kazi Nazrul Islam Airport</option>
                                                            <option value="West-Bengal">Hasimara Air Force Station</option>
                                                            <option value="West-Bengal">Kanchrapara Airfield</option>
                                                            <option value="West-Bengal">Kalaikunda Air Force Station</option>
                                                            <option value="West-Bengal">Netaji Subhash Chandra Bose International Airport</option>
                                                            <option value="West-Bengal">Malda Airport</option>
                                                            <option value="West-Bengal">Panagarh Airport</option>
                                                            <option value="West-Bengal">Charra Airfield</option>
                                                            <option value="West-Bengal">Bagdogra Airport</option>
                                                        </optgroup>    

                                                    </select></sub>
                                            </div>
                                            <br><Br>
                                            <button type="submit" id="tabtn1" class="btn btn-primary"><b>SUBMIT</b></button>
                                        </form>
                                    </div>
                                </div>
                            </div>
                            <div class="panel-footer" style="background-color:green">Fill all details of Flights</div>
                        </div>
                    </div>
                </div>

            </div>

        </div>






        <script>
            $("#select1").change(function () {
                if ($(this).data("options") === undefined) {
                    /*Taking an array of all options-2 and kind of embedding it on the select1*/
                    $(this).data("options", $("#select2 option").clone());
                }
                var id = $(this).val();
                var options = $(this).data("options").filter("[value=" + id + "]");
                $("#select2").html(options);
            });
        </script>

    </body>
</html>