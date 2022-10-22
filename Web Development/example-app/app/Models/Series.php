<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Factories\HasFactory;
use Illuminate\Database\Eloquent\Model;

class Series extends Model
{
    use HasFactory;
    public $timestamps = false;

    /**
     * The model's default values for attributes.
     *
     * @var array
     */

    protected $attributes = [
        'name' => "John doe",
    ];

    // allow mass assignment
    protected $fillable = ["name"];
}
