wget http://apache.mirrors.hoobly.com/spark/spark-3.0.0-preview2/spark-3.0.0-preview2-bin-hadoop2.7.tgz

tar -zvxf spark-3.0.0-preview2-bin-hadoop2.7.tgz

export SPARK_HOME=~/spark-3.0.0-preview2-bin-hadoop2.7

Export PATH=$PATH:$SPARK_HOME/bin/
