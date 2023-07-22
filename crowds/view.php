<?php


//simple script to view comments
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

$query = "SELECT * FROM crowdinfo ORDER BY report_timestamp DESC";
$result = mysqli_query($link, $query);

if (!$result) {
    die('Error executing the query: ' . mysqli_error($link));
}
?>

<!doctype html>
<html>
<head>
    <title>View Crowd Info</title>
</head>
<body>

<h1>View Crowd Info</h1>
<ol>
    <?php while ($row = mysqli_fetch_assoc($result)) { ?>
        <li>
            <ul>
                <li><small>Date: <?= $row['report_timestamp'] ?></small></li>
                <li><small>ID: <?= $row['crowdinfo_id'] ?></small></li>
                <li><small>Name: <?= $row['name'] ?></small></li>
                <li><small>Hazard Type: <?= $row['hazard_type'] ?></small></li>
                <li><small>Location: <?= $row['hazard_loc'] ?></small></li>
                <li><small>Description: <?= $row['hazard_desc'] ?></small></li>
                <li><small>Latitude: <?= $row['hazard_lat'] ?></small></li>
                <li><small>Longitude: <?= $row['hazard_long'] ?></small></li>
                
                </li>
            </ul>
            <br />
        </li>
    <?php } ?>
</ol>

</body>
</html>