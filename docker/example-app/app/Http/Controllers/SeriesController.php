<?php

namespace App\Http\Controllers;

use App\Models\Series;
use Illuminate\Http\Request;

class SeriesController extends Controller
{

    function list()
    {
        // $series = Series::all();
        $series = Series::query()->orderBy("name")->get();
        // return $series;
        return view("series.index", compact('series'));
    }

    public function create()
    {
        return view("series.create");
    }

    public function store(Request $request)
    {
        // Ways to insert

        $Series = new Series();

        // First method
        // $Series->name = $request->name;
        // $Series->save();

        // Second method
        // $Series::create([
        //     "name" => $request->name,
        //     // "phone" => $request->phone, // <- you can add more than one at once
        // ]);

        // Third method
        $Series = Series::create($request->all());

        $series = Series::all();
        // return view("series.index", compact('series'));
        return redirect("/series");
    }
}
