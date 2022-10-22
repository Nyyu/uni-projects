<?php

use App\Http\Controllers\CarrosController;
use App\Http\Controllers\DisciplinasController;
use App\Http\Controllers\HomeController;
use App\Http\Controllers\LivrosController;
use App\Http\Controllers\ProductsController;
use App\Http\Controllers\SeriesController;
use Illuminate\Support\Facades\Route;

/*
|--------------------------------------------------------------------------
| Web Routes
|--------------------------------------------------------------------------
|
| Here is where you can register web routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| contains the "web" middleware group. Now create something great!
|
 */

// Simple route
Route::get('/', function () {
  return view('welcome');
});
// Optional parameter
Route::get('/test/{temp?}', null);

// Using controller
Route::get('/home', HomeController::class);

// Using secondary function inside the controller
Route::get('/home2', [HomeController::class, 'principal']);

// Series
Route::get('/series', function () {
  return redirect('/series/listing');
});
Route::get('/series/listing', [SeriesController::class, 'list']);
Route::get('/series/create', [SeriesController::class, 'create']);
Route::post('/series/create', [SeriesController::class, 'store']);

// Products
Route::get('/products', function () {
  return redirect('/products/listing');
});
Route::get('/products/listing', [ProductsController::class, 'list']);
Route::get('/products/create', [ProductsController::class, 'create']);
Route::post('/products/create', [ProductsController::class, 'store']);

// Livros
Route::get('/livros', function () {
  return redirect('/livros/listing');
});
Route::get('/livros/listing', LivrosController::class);

// Carros
Route::get('/carros', function () {
  return redirect('/carros/listing');
});
Route::get('/carros/listing', CarrosController::class);

// Disciplinas
Route::get('/disciplinas', function () {
  return redirect('/disciplinas/listing');
});
Route::get('/disciplinas/listing', DisciplinasController::class);
