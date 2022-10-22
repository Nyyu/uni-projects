@extends('layout')

@section('title')
  Series | Criar nova serie
@endsection

@section('heading-title')
  Creating a new product
@endsection

@section('heading-content')
  <a href="/products/list" class="btn btn-primary"> &larr; voltar </a>
@endsection

@section('content')
  <form class="mt-2" method="POST" action="/products/create">
    @csrf
    <div class="mb-3">
      <label class="form-label">Products' description</label>
      <input type="text" class="form-control input" id="description" name="description">
    </div>

    <button type="submit" class="btn btn-primary bg-primary hover:brightness-75 transition-all">Submit</button>
  </form>
@endsection
      
