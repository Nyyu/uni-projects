# DOCKER

## Documentation

- (Docker-CLI)[https://docs.docker.com/engine/install/fedora/]
- (Laravel)[https://laravel.com/docs/9.x/installation#getting-started-on-linux]

## Basic commands

```bash

# -- DOCKER -- #

# Start docker
sudo systemctl start docker

# Run image
sudo docker run [image-name]

# -- LARAVEL -- #

# Create a new project
curl -s https://laravel.build/example-app | bash

# "sail ur project"
cd example-app
./vendor/bin/sail up

# Making controllers
php artisan make:controller ProvisionServer --invokable

```


