<?php

namespace App\Http\Controllers;

use illuminate\http\Request;

class HomeController extends Controller
{
  public function __invoke()
  {
    return view('home');
  }

  public function principal()
  {
    return "principal value";
  }
}
