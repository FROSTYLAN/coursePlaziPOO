<?php

require_once('car.php');
require_once('uberX.php');
require_once('account.php');

$car = new car('AWE456', new account("Andres Herrera", "12748558"));
$car->printDataCar();

$uberX = new UberX("CVB123", new Account("Charles Castillo", "75867760"), "Chevrolet", "Spark");
$uberX->printDataCar();

?>