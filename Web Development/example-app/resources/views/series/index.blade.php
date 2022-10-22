@extends('layout')

@section('heading-title')
  Listagem
@endsection

@section('title')
  Series | listar series
@endsection

@section('heading-content')
  <a href="/series/create" class="btn btn-primary">Adicionar</a>
@endsection

@section('content')
  <ul class="list-group">
    @foreach ($series as $serie)
      <li class="list-group-item">
        {{ $serie->name }}
      </li>
    @endforeach
  </ul>
@endsection