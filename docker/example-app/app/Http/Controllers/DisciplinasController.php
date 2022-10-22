<?php

namespace App\Http\Controllers;

class DisciplinasController extends Controller
{
    public function __invoke()
    {
        return view('disciplinas.index', ['disciplinas' => ['disciplina1', 'disciplina2', 'disciplina3', 'disciplina4', 'disciplina5']]);
    }
}
