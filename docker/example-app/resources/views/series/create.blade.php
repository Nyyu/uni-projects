@extends('layout')

@section('title')
  Series | Criar nova serie
@endsection

@section('heading-title')
  Criar nova serie
@endsection

@section('heading-content')
  <a href="/series/list" class="btn btn-primary"> &larr; voltar </a>
@endsection

@section('content')
  <form class="mt-2" method="POST" action="/series/create">
    @csrf
    <div class="mb-3">
      <label class="form-label">Serie's name</label>
      <input type="text" class="form-control input" id="name" name="name">
    </div>

    <button type="submit" class="btn btn-primary bg-primary hover:brightness-75 transition-all">Submit</button>
  </form>
@endsection
      
