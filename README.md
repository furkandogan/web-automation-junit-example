# Web Automation Junit Example

<p align="center">
  <img id="header" height="214" width="500" src="./docker_configs/docker_zalenium/images/logo_zalenium_wide.png" />
</p>

<p align="center">
  <img id="header" src="https://raw.githubusercontent.com/butomo1989/docker-android/master/images/logo_dockerandroid_small.png" />
</p>

This example test project is prepared from selenium and junit.
It uses web-automation-template library.

* It uses [docker-zalenium](https://github.com/zalando/zalenium) and [docker-selenium](https://github.com/elgalu/docker-selenium) to run your tests in Firefox and Chrome.
* For web responsive design it uses [butomo1989/docker-android-x86-8.1](https://github.com/butomo1989/docker-android)

## Getting Started
* If you want to run your test remote, you will read following paragraphs

#### Prerequisites
* Docker engine running, version >= 1.11.1 (probably works with earlier versions, not tested yet).
* Make sure your `docker-compose` installed.
* Make sure your docker daemon is running (e.g. `docker info` works without errors).

* Pull the [docker-selenium](https://github.com/elgalu/docker-selenium) image. `docker pull elgalu/selenium`

* `docker pull dosel/zalenium`

#### Run it
  ```sh
   # Pull docker-selenium
    docker pull elgalu/selenium

    # Pull Zalenium
    docker pull dosel/zalenium

    docker run --rm -ti --name zalenium -p 4444:4444 \
      -v /var/run/docker.sock:/var/run/docker.sock \
      -v /tmp/videos:/home/seluser/videos \
      --privileged dosel/zalenium start \
      --desiredContainers 2 \
      --maxDockerSeleniumContainers 2 \
      --maxTestSessions 2 \
      --screenWidth 1920 --screenHeight 1080 \
      --timeZone "Europe/Istanbul" \
      --videoRecordingEnabled true \
      --keepOnlyFailedTests false \
      --debugEnabled true \
      --seleniumImageName elgalu/selenium
  ```

  or you can run it just

    ```sh
    cd /web-automation-junit-example/docker_configs/docker_zalenium
    docker-compose up -d
    ```

* More usage examples, parameters, configurations, video usage and one line starters can be seen [here](https://zalando.github.io/zalenium/)
* Stop it: `docker stop zalenium` or `docker-compose down`

## Additional features
* [Dashboard](http://localhost:4444/dashboard), see all the videos and aggregated logs after your tests completed.
  <p align="center">
    <img id="dashboard" width="600" src="docker_configs/docker_zalenium/images/dashboard.gif" />
  </p>
* Live preview of your running tests [http://localhost:4444/grid/admin/live](http://localhost:4444/grid/admin/live)
<p align="center">
  <img id="live-preview" width="600" src="docker_configs/docker_zalenium/images/live_preview.gif" />
</p>

* Video recording, check them in the `/tmp/videos` folder (or the one you mapped when starting Zalenium)
* Check the complete documentation at https://zalando.github.io/zalenium/

