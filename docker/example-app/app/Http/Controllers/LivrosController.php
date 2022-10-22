<?php

namespace App\Http\Controllers;

class LivrosController extends Controller
{
    public function __invoke()
    {
        return view('livros.index', ['livros' => ['livro1', 'livro2', 'livro3', 'livro4', 'livro5']]);
    }
}
