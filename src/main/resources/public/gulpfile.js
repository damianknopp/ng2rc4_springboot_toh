"use strict"

let gulp = require("gulp");
let ts = require("gulp-typescript");
let tsProject = ts.createProject("tsconfig.json");


const DEST = "app";

gulp.task("default", function () {
    return tsProject.src()
        .pipe(ts(tsProject))
        .js.pipe(gulp.dest(DEST));
});
