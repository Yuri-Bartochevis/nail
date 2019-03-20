
$ gradle build;

$ docker build . -t light

$ docker run -p 8080:8080 light  

// docker run -p dockerport:appserverport dockerimagename
// https://www.serverlab.ca/tutorials/containers/docker/how-to-limit-memory-and-cpu-for-docker-containers/

$ docker run -it --memory=512m --memory-swap=512m  --cpuset-cpus=0  --oom-kill-disable -p 8080:8080  light 


//"Unless the initial and maximum heap sizes are specified on the command line, they're calculated based on the amount of memory on the machine. The default maximum heap size is one-fourth of the physical memory while the initial heap size is 1/64th of physical memory. The maximum amount of space allocated to the young generation is one third of the total heap size."