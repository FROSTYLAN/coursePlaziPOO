<?php

require_once('account.php');

class User extends Account {
  public function __construct($name, $document)
  {
    parent::__construct($name, $document);
  }
}

?>