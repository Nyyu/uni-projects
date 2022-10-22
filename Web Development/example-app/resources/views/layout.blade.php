<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>
    @yield('title')
  </title>

  <!-- CSS only -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
  <script src="https://cdn.tailwindcss.com"></script>

</head>
<body>
<div class="container flex flex-col gap-3 p-4">
    <div class="card w-full">
      <div class="card-body">
        <h5 class="card-title">@yield('heading-title')</h5>
        @yield('heading-content')
      </div>
    </div>

    <br />

    @yield('content')
  </div>
</body>
</html>
