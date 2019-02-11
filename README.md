## 关于周末吃什么所引申的思考与实践
* 2019年2月2日，凌晨三点五十分，在去往北京站的路上，可能是饿了，就在心里自问了一句：等会下车吃点啥呢？路过肯德基，也一如我所料，灯火通明，人山人海，寂静无声，不知有多少归乡的游子在此躲避北京冬日的严寒。抬头看了一眼时间，快发车了。想着自己随身带的干粮，没有过多犹豫，走向了安检.。

* 2019年2月2日，上午十点半，归途的火车上，我被邻座姑娘的吧唧声吵醒，同时肚子也开始求饶，希望得到救济。我翻了翻包裹，想起前一阵因为吃泡面被骂的那人，我撕开饼干盒子，但并没有吃，因为我猛然想起早上吃什么的问题。我在记事本上写下这样几个字“猜你中午想吃啥”？然后打开手机听起了音乐。和多数年轻人一样，旅途中，我的嘴是缝起来的，心思却是异常活络的，其实也无外乎和窗外流水景致一般，胡思乱想罢了。如果把“吃什么”上纲上线到一个研究课题上的话，想来一定是人人都有话要说。但我作为的一个猿类，站在程序设计的角度，要怎么实现这个预测模型，并拉拢用户去训练，用一套模型去满足不同用户的需求成了关键，这也是我比较感兴趣的部分。首先我不得不得承认，之前没怎么接触过数据建模相关知识。但鲁迅大人可能说过“如果做事不做绝，那请把问题思考的透彻一点儿”。于是，我在记事本上，又写下了这样一句话：“人吃什么，到底和什么有关系”？

* 2019年2月3日，清晨，奔波后，经过了一天的休整，我开始拿起家里的一个笔芯，去思考这个吃什么的问题。我秉承着“逆向思维出奇迹”的理论去思考之后。新问题来了：人不吃什么究竟和什么有关系呢？我找到以下两个方面：1、忌口，如果从基因层面就吃不了某样食物，比如香菜。那么中午这个人一定不吃带香菜的食物，这是肯定的，所以站在用户的角度讲，你随机推荐的食物应该排除带香菜的部分。亦或者是某些疾病，成长困扰（青春痘）造成的不可抗力，这人就是不能吃辛辣油腻的食物的时候，忌口就成为强筛选条件了。2、宗教，虽然我是无神论者，但我肯定尊重任何一个国家或者民族的信仰。比如，伊斯兰教徒不吃猪肉，甚至只吃自己宰杀出来的清真食品。所以在给这类人做食物推荐的时候，我们也要区别对待，所以宗教信仰也是一个强筛选条件。我无意将简单问题复杂化，但事实是，一开始我的确想做一个小程序或者 APP，换做是一年前的我，可能“周末怎么吃(英文：EH)”这款 APP 的 Android 版本已经在各大平台上架了。但今时不同往日，现在不是一个 to C找痛点做重复微创新的时代，你做一套我做一套，纯粹是在浪费用户选择的时间，现在应该是一个to B 讲求通用力的后互联网时代。所以我决定不做APP，不做小程序，改为提供一套开源的API接口。于是我用那个笔芯，在桌子上划拉了鲁迅可能又说过的一句话：“想做不能做，是能力问题，能做不想做，是利益问题，能做却不做，最是难把握”。

* 2019年2月4日和5日，过年就是过年，该吃吃该喝喝，但我在记事本上又写了这样一句话“人吃什么也和节日有关”。

* 2019年2月6日，晚上，当楼门外的炮声稀稀拉拉的时候，我打开电脑开始干活了。人吃什么的问题，也终于落在了键盘上，一个人下顿饭吃什么，强相关因素很重要，但弱相关性也不能忽视。那这个弱相关性是什么呢？假如现在是冬天，一个适合吃火锅的季节，那么冬天就是影响吃什么的弱相关因素，之所以是弱相关，是因为我也可以不吃火锅，去吃烧烤，这完全没有问题。所以能抽象出来影响一个人下顿吃什么的弱相关因素如下：地域、季节、时间（每天）、人数、节日。吃什么其实也和人的心情有关，但是没法用程序去表达，我们只是为了大概率推荐出常规用户的选择。 站在上述几个维度，思路就变得很清晰了，用户每次触发所得的食物，都会被记录下来（这个逻辑还没做）。这个弱相关性的权重，以用户点击次数为主。随着与用户交互的次数的增加，推荐的食物慢慢会变得随机且常规。

* 2019年2月10日，经过几天的琢磨，关于随机权重推荐算法的代码部分我按照我之前的思路开发了个大概。程序只是一个初稿，还有很多的细节的部分需要完善，同时里面也打了很多todo。接下来有几点注意事项吧。


***
1.食物数据源问题，这个还算小问题，等我有时间，可以把[美食网](https://www.xiangha.com/caipu/z-jiachangcai/)数据弄下来做底子。【声明】我暂时应该不会把我手上的数据库资源分享出来，因为里面还没有数据，需要先用自己的。
2.第二个问题就比较麻烦了，需要对数据进行打标，（时间有限我还没来得及开发API出来）这个可能需要些功夫了。
3.【敲黑板】如果需要回归问题本质的话，我们推荐的内容就是引导，就好像有个朋友来问我们程序，我不知道中午吃啥，你给想一个，程序说，去吃小龙虾吧。但最后朋友去了吃肯德基也是合理的，这个程序的目的就是为了打开用户的思路，说不好听点，你瞎胡扯也是没有问题的，做这个的目的就是为了程序推荐的东西不要太偏离实际。
4.建表语句如下： 

***

`CREATE TABLE `food_list` (
  `food_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '食物ID',
  `food_name` varchar(64) COLLATE utf8_bin NOT NULL COMMENT '食物名称',
  `food_type` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '食物类型 枚举：主食（STAPLE）、菜(DISH)、其他(OTHER)',
  `food_num` int(10) DEFAULT 0 COMMENT '吃东西的人数',
  `crowd` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '食物最适合吃的人群 枚举：家人（FAMILY）、情侣（COUPLE）、朋友（FRIEND）',
  `season` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '季节 枚举：SPRING、SUMMER、AUTUMN、WINTER',
  `place_to_eat` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT ' 适合吃的地域 枚举：NORTH、SOUTH',
  `time_to_eat` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT ' 食物最适合吃的时间 枚举：MORNING、NOON、DINNER',
  `belief_to_eat` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT ' 食物的信仰禁忌  普通/回族/猪肉/牛羊肉 枚举：NORMAL',
  `taste` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '口味 枚举：油腻 GREASE、辛辣 SPICY 、清淡 LIGHT',
  `food_price` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '食物的成本',
  `food_link` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '食物常规做法的链接',
  `take_out_food` varchar(64) COLLATE utf8_bin DEFAULT NULL COMMENT '是否适合点外卖',
  `one_people_choose` bigint(20) DEFAULT 0 COMMENT '人数为一的时候食物选择的次数',
  `more_people_choose` bigint(20) DEFAULT 0 COMMENT '人数为多人的时候食物选择的次数',
  `spring_people_choose` bigint(20) DEFAULT 0 COMMENT '春天时选择的次数',
  `summer_people_choose` bigint(20) DEFAULT 0 COMMENT '夏天时选择的次数',
  `autumn_people_choose` bigint(20) DEFAULT 0 COMMENT '秋天时选择的次数',
  `winter_people_choose` bigint(20) DEFAULT 0 COMMENT '冬天时选择的次数',
  `north_people_choose` bigint(20) DEFAULT 0 COMMENT '北方人选择的次数',
  `south_people_choose` bigint(20) DEFAULT 0 COMMENT '南方人选择的次数',
  `morning_people_choose` bigint(20) DEFAULT 0 COMMENT '早餐选择的次数',
  `noon_people_choose` bigint(20) DEFAULT 0 COMMENT '午餐选择的次数',
  `dinner_people_choose` bigint(20) DEFAULT 0 COMMENT '晚餐选择的次数',
  PRIMARY KEY (`food_id`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='食物表';`

***

