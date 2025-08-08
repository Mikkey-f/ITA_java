// 变量
const PI=3.14 // export: 允许导入之后被使用
const PI2=3.14
//方法
function sum(a,b){
    return a+b
}
// 类
class Person{
    constructor(name,age){
        this.name=name
        this.age=age
    }
    sayHello(){
        console.log(`hello ,my name is ${this.name} , I'am ${this.age} years old`)
    }

}



export{PI,sum,Person}  //统一导出