# quiz-service

This a service extracted from a group of mico-services. It is a Spring Native project.

The project runs natively when deployed in a docker container.

However when compiled and run as a standalone project it throws some errors. How to reproduce the error on Ubuntu.

```
gradle nativeCompile
```

Run project:

```
build/native/nativeCompile/quiz-service
```

Error it shows.

```
error while loading shared libraries: libfreetype.so: cannot open shared object file: No such file or directory
```
