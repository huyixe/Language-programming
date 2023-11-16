1.变量
1.1变量的命名规则
    1.变量必须以$开头，$符不是变量的一部分，仅表示后面的标识符是变量名。 
    2. 除了$以外，以字母、下划线开头，后面跟着数字、字母、下划线
    3. 变量名区分大小写，$aa和$Aa是两个空间
<?php
    $a=10;
    $name='Tom';
?>

1.2可变变量
    变量名可以变，将变量名存储在另外一个变量中
<?php
$a=10;
$b='a';
echo $$b;
?>
<?php
    $name1='tom';
    $name2='berry';
    if(rand(1,10)%2){
        $naem='name1';
    }else{
        $name='name2';
    }
    echo $$name;
?>

1.3变量传递
值传递中，一个变量变了，另一个变量没有影响，因为是两个空间
<?php
    $num1=10;
    $num2=$num1;
    $num2=20;
    echo $num1;
?>
地址传递中，一个变量变了，另一个也变了，因为两个变量指向同一个空间
<?php
    $name1=10;
    $name2=&$num1;
    $num2=20;
    echo $num1;
?>

1.4销毁变量
用unset()来销毁变量，销毁的是变量名，变量值由PHP垃圾回收机制销毁
<?php
$num1=10;
$num2=&$num1;
unset($num1);
echo $num2;
?>

2.常量
在整个运行过程中，固定不变的值
2.1定义常量
    1、用define()函数定义常量
    define(常量名，值，[是否区别大小写]) true表示不区分大小写，默认是false 
    常量名前没有$符 
    常量名推荐使用大写
<?php
define('NAME','tom');
define('PI',3.14,true);
echo NAME,'<br>','PI';
?>
    2、定义常量可以用特殊字符，但是在调用的时候必须用 constant 关键字调用
define('%-%','tom');
echo constant('%-%');
    3、判断常量是否定义，通过defined()判断常量是否已经定义
if(!defined('NAME')){
    define('NAME','berry');        
}
echo NAME;
    4、还可以使用const关键字定义常量 
cost NAME='tom';
echo NAME;

2.2预定义常量
PHP预先定义好的常量
echo PHP_VERSION,'<br>';
echo PHP_OS,'<br>';       //PHP操作系统
echo PHP_INT_MAX,'<br>';

2.3魔术常量
魔术常量它们的值随着它们在代码中的位置改变而改变
echo __LINE__,'<br>';  //获取当前行号
echo __FILE__,'<br>';  //文件的完整路径和文件名
echo __DIR__,'<br>';   //文件所在的目录

3.数据类型
数据类型有两种：强类型和弱类型 PHP是弱类型
3.1基本类型（标量类型)
    1、整型 
    存整数，PHP_INT_MAX获取整形最大值 PHP支持8、10、16机制的整数
<?php
$num1=10;
$num2=010;
$num3=0x10;

echo $num1,'<br>';
echo $num2,'<br>';
echo $num3;
?>

echo decbin(123),'<br>'; //十进制转二进制 
echo bindec(1111011),'<br>'; //二进制转十进制 
echo dechex(123),'<br>'; //十进制转十六进制 
echo hexdec('7b'),'<br>'; //十六进制转十进制 
echo decoct(123); //十进制转八进制
    2.浮点型
    浮点数在内存中保存的是近似值 浮点数不能参与比较

var_dump(0.9==(1-0.1));//bool(true)
echo '<br>';
var_dump(0.1==(1-0.9));//bool(false)

如果浮点数要比较，必须确定比较的位数
var_dump(0.9==(1-0.1)); //bool(true) 
echo '<br>'; 
var_dump(0.1==(1-0.9)); //bool(false) 
echo '<br>'; 
var_dump(bccomp(0.1,1-0.9,5)); //比较小数点后面5位 int(0) 0表示相等
    3.字符串型
    在PHP中单引号字符串和双引号字符串是有区别的 
    单引号字符串是真正的字符串 
    双引号字符串要解析字符串中的变量
$name='tom';
echo '我的名字叫$name','<br>'; //我的名字叫$name 
echo "我的名字叫$name",'<br>'; //我的名字叫tom
{ }取变量值
$name='tom'; 
echo '$name是我的名字','<br>'; //$name是我的名字 
echo "{$name}是我的名字",'<br>'; //{}表示获取变量的值（tom是我的名字） 
echo "${name}是我的名字",'<br>'; //$和{只要挨着一起就可以（tom是我的名字)
输出特殊字符
echo '毛主席说：\'上课不要睡觉\'','<br>'; //转义字符 毛主席说：'上课不要睡觉' 
echo '文件保存在c:\\'; //文件保存在c:\
字符串定界符
1、有 <<< 开头，后面跟的是标识符 
2、字符串定界符的结束符必须顶格写，前面不能有任何的空白字符 
3、字符串定界符分为两种，heredoc（双引号），nowdoc（单引号)
//heredoc
$name='tom';
echo <<<sha1
$naem <br>
<strong>chrdw</strong>
<em>hdhxt</em>
<u>szpzc</u>
<hr>
shi;
//nowdoc
echo <<<'shi'
$name <br>
<strong>chrdw</strong>
<em>hdhxt</em>
<u>szpzc</u>
shi;

3.2 复合类型
    1、数组
    在PHP中数组有两种形式，索引数组和关联数组 
    索引数组：用整数做下标，默认从0开始，后面依次加一 
    关联数组：用字符串做下标，通过=>符号将下标和值关联起来
<?php
//1、索引数组的声明 
$stu=array('tom','berry','ketty'); //索引数组 
print_r($stu); //输出数组 Array ( [0] => tom [1] => berry [2] => ketty ) 
echo '<hr>'; 
echo $stu[0],'<br>'; //tom 
echo $stu[1],'<br>'; //berry 
echo $stu[2],'<hr>'; //ketty 
------------------------------------------ 
//2、关联数组 
$emp=array('name'=>'李白','sex'=>'男','age'=>22); 
print_r($emp); //Array ( [name] => 李白 [sex] => 男 [age] => 22 ) 
echo '<hr>'; 
echo $emp['name'],'<br>'; //李白 
echo $emp['sex'],'<br>'; //男 
echo $emp['age']; //22
?>