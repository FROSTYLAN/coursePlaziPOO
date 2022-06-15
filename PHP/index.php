<?php

require_once('car.php');
require_once('account.php');

$car = new car('AWE456', new account("Andres Herrera", "12748558"));
$car->printDataCar();

?>