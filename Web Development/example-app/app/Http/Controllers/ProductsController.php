<?php

namespace App\Http\Controllers;

use App\Models\Products;
use Illuminate\Http\Request;

class ProductsController extends Controller
{

    function list() {
        $products = Products::all();
        // return $products;
        return view("products.index", compact('products'));
    }

    public function create()
    {
        return view("products.create");
    }

    public function store(Request $request)
    {
        $description = $request->description;

        $Products = new Products();
        $Products->description = $description;
        $Products->save();

        $products = Products::all();
        return view("products.index", compact('products'));
    }
}
