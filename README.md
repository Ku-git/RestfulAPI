# RestfulAPI
basic demo for restful api project
用springboot建立一個和班級有關的API（有get 有post) ，回傳一律為json，整個過程中不用連線資料庫

- get  採用pathvariable 輸入班級編號， services層裡寫好一個map存放要查詢的班級資料（有班級編號及班級人數），此api回傳該班級編號所查詢到的班級資料（in json)

- post 的api接收兩個參數（in JSON)，班級編號以及人數，接受後新增資料在service層中的data map中
