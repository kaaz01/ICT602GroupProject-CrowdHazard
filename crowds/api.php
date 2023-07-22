<?php


//simple api for database insertion
// Writen by Mohammad Hafiz bin Ismail

/***
    Copyright (c) 2021 by Mohammad Hafiz bin Ismail (mypapit@gmail.com)
    Redistribution and use in source and binary forms, with or without
    modification, are permitted provided that the following conditions are met:

    1. Redistributions of source code must retain the above copyright notice, this list
    of conditions and the following disclaimer.

    2. Redistributions in binary form must
    reproduce the above copyright notice, this list of conditions and the following
    disclaimer in the documentation and/or other materials provided with the
    distribution.

    THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES WITH
    REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND
    FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY SPECIAL, DIRECT,
    INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS
    OF USE, DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
    TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR PERFORMANCE OF
    THIS SOFTWARE.
***/


require_once('db.php');

 if (!isset($_POST['name']) && !isset($_POST['hazard_long']) ){
   die("Error incomplete HTTP request");



 }

 if (strlen($_POST['name']) < 3  || strlen($_POST['hazard_long'])<5) {

   die("Error plese fill in the form");

 }

//kena filter semua input, bahaya kalau tak filter
$POSTV = filter_input_array(INPUT_POST,
    ['name' => FILTER_SANITIZE_STRING,
     'hazard_type' => FILTER_SANITIZE_STRING,
     'hazard_loc' => FILTER_SANITIZE_STRING,
     'hazard_desc' => FILTER_SANITIZE_STRING,
     'hazard_lat' => FILTER_SANITIZE_STRING,
     'hazard_long' => FILTER_SANITIZE_STRING,
    ]
);
$name = $POSTV['name'];
$type = $POSTV['hazard_type'];
$loc = $POSTV['hazard_loc'];
$desc = $POSTV['hazard_desc'];
$lat = $POSTV['hazard_lat'];
$lng = $POSTV['hazard_long'];

$query= "INSERT INTO crowdinfo (name, hazard_type, hazard_loc, hazard_desc, hazard_lat, hazard_long)
VALUES ('$name','$type','$loc','$desc', '$lat','$lng')";

$result=mysqli_query($link, $query);

if (!$result) {

  echo mysqli_error($link);

} else {

echo "Comments posted";

}


 ?>
