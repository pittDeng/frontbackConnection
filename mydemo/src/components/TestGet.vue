<template>
<div class="test">
    <button @click="getfrom()">点我</button>
    <p>The message is : {{message}}</p>
    <p>Time is: {{time}}</p>
</div>
</template>
<script>
import axios from 'axios'
export default{
    name:'TestGet',
    data:function(){
        return{
            message:"null",
            time:0
        }
    },
    methods:{
        getfrom:function() {
            self=this;
            let instance=axios.create({
            baseURL:"http://192.168.1.112:8080/",
            timeout:1000,
            });
            instance.get("").then(function(response){
                self.message=response.data.message;
                self.time=response.data.time;
                //console.log(response.config.data);
                console.log(response);
            }).catch(function(error){
                console.log(error);
            })
        }
    }
}
</script>