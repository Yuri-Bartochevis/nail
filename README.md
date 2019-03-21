# Nail
Simple application to understand better how to handle with threads inside JVM

###Running on Steps

```
$ gradle build;
```
```
$ docker build . -t light
```
```
$ docker run -p 8080:8080 light  
```

explanation: docker run -p dockerport:appserverport dockerimagename


how to allow memory swap ->
 ```
 https://www.serverlab.ca/tutorials/containers/docker/how-to-limit-memory-and-cpu-for-docker-containers/
```

```
$ docker run -it --memory=512m --memory-swap=512m  --cpuset-cpus=0  --oom-kill-disable -p 8080:8080  light 
```

//"Unless the initial and maximum heap sizes are specified on the command line, they're calculated based on the amount of memory on the machine. The default maximum heap size is one-fourth of the physical memory while the initial heap size is 1/64th of physical memory. The maximum amount of space allocated to the young generation is one third of the total heap size."


```
  $docker run -it --memory=512m --memory-swap=512m  --cpuset-cpus=0  --oom-kill-disable -p 8080:8080 -p 8849:8849 light
```

jprofile -> https://clairekeum.wordpress.com/2017/10/18/monitoring-a-containerized-app-with-jprofiler/
         -> https://gist.github.com/Kevin-Lee/cbfbde89d68299304b1b1a2e6371fe06
