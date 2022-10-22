@extends('layout')

@section('heading-title')
  Listagem
@endsection

@section('title')
  Products | listar products
@endsection

@section('heading-content')
  <a href="/products/create" class="btn btn-primary">Adicionar</a>
@endsection

@section('content')
    <table class="table-auto table">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">DESCRIPTION</th>
        </tr>
      </thead>
      <tbody>
        @foreach ($products as $product)
          <tr class="">
            <td>{{ $product->id }}</td>
            <td>{{ $product->description }}</td>
          </tr>
        @endforeach 
      </tbody>
    </table>
@endsection