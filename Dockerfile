FROM openjdk:11
COPY . /app
WORKDIR /app/bin
CMD ["java","te_nov_java_selenium_ind_wd.Test1"]