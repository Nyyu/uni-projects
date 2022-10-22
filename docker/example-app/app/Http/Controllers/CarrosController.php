<?php

namespace App\Http\Controllers;

class CarrosController extends Controller
{
    public function __invoke()
    {
        return view('carros.index', ['carros' => ['carro1', 'carro2', 'carro3', 'carro4', 'carro5']]);
    }
}
