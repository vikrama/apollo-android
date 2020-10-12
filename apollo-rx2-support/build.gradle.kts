plugins {
  kotlin("jvm")
}

dependencies {
  api(project(":apollo-api"))
  api(groovy.util.Eval.x(project, "x.dep.rx.java"))
  api(project(":apollo-runtime"))
  api(project(":apollo-normalized-cache"))
}


