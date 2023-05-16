package my_api


import grails.rest.*
import grails.converters.*

class EmployeeController extends RestfulController {
    static responseFormats = ['json', 'xml']
    EmployeeController() {
        super(Employee)
    }
}
