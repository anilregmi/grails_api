package my_api


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Employes {
    String name
    String department
    int age
}