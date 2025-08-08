// 变量
export const PI=3.14 // export: 允许导入之后被使用
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

//默认导出在一个js 中只能有一个
export default sum