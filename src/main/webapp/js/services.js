'use strict';

var services = angular.module('fs-services', []);

services.service("Navigation", function () {
  var data = {};

  this.registerPages = function(elm, title, submitFoo) {
    data.elm = elm;
    data.pagesCount = elm.children().length;
    data.currentPage = 0;
  };

  this.setWidth = function(w) {
    data.width = w;
  };

  this.next = function() {
    console.log('n');
    data.currentPage = data.currentPage + 1;
    this.adjust();
  };

  this.back = function() {
    console.log('b');
    data.currentPage = data.currentPage - 1;
    this.adjust();
  };

  this.adjust = function() {
    var offest = data.currentPage * data.width;
    data.elm.css('-webkit-transform', 'translate(-' + offest + 'px, 0)');
  };

});

