#!/bin/bash

if [ -z ${log_home} ] ; then
    log_home="/tmp/logs/servlet-lifecycle"

    if [ ! -d ${log_home} ] ; then
        mkdir -p ${log_home}
    fi
fi

export root_dir=$0/..

#-XX:+TraceClassLoading

export GRADLE_OPTS=" -XX:PermSize=128M -XX:MaxPermSize=256m -Xnoagent -Djava.compiler=NONE -Xdebug   -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=8280"

if [ "z"$JREBEL_HOME != "z" ] ; then
export GRADLE_OPTS=" -noverify -agentpath:$JREBEL_HOME/libjrebel64.so -Drebel.jersey_plugin=true -Drebel.spring_plugin=true -Drebel.ibatis_plugin=true -Drebel.disable_update=true $GRADLE_OPTS"
fi

gradle -p $root_dir --no-daemon clean jettyRun -PdevRunLocalJettyServer -Dapp.log.home=${log_home} -DhttpPort=8080 -DstopPort=8081
