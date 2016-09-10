package com.mansoul.mvptraing.bean;

import java.util.List;

/**
 * Created by Mansoul on 16/9/9.
 */
public class GankGirl {

    /**
     * error : false
     * results : [{"_id":"57d16f1b421aa90d2d8a4f52","createdAt":"2016-09-08T22:00:59.815Z","desc":"09-09","publishedAt":"2016-09-09T11:53:48.777Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f7mixvc7emj20ku0dv74p.jpg","used":true,"who":"代码家"},{"_id":"57d0a893421aa90d312ebeff","createdAt":"2016-09-08T07:53:55.620Z","desc":"9-9","publishedAt":"2016-09-08T11:43:04.471Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f7lughzrjmj20u00k9jti.jpg","used":true,"who":"代码家"},{"_id":"57cf601d421aa90d2d8a4f3b","createdAt":"2016-09-07T08:32:29.460Z","desc":"09-07","publishedAt":"2016-09-07T11:50:57.951Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f7kpy9czh0j20u00vn0us.jpg","used":true,"who":"代码家"},{"_id":"57ce103a421aa910f56bd8b9","createdAt":"2016-09-06T08:39:22.211Z","desc":"9-7","publishedAt":"2016-09-06T11:35:21.379Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034jw1f7jkj4hl41j20u00mhq68.jpg","used":true,"who":"代码家"},{"_id":"57cc16c9421aa910f56bd8ab","createdAt":"2016-09-04T20:42:49.403Z","desc":"09-05","publishedAt":"2016-09-05T11:32:16.999Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f7hu7d460oj20u00u075u.jpg","used":true,"who":"daimajia"},{"_id":"57c83167421aa9125fa3edd0","createdAt":"2016-09-01T21:47:19.924Z","desc":"Whatever","publishedAt":"2016-09-02T20:36:28.951Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f7ef7i5m1zj20u011hdjm.jpg","used":true,"who":"daimajia"},{"_id":"57c6dcd0421aa9125fa3edc5","createdAt":"2016-08-31T21:34:08.961Z","desc":"9-1","publishedAt":"2016-09-01T11:31:19.288Z","source":"chrome","type":"福利","url":"http://ww3.sinaimg.cn/large/610dc034jw1f7d97id9mbj20u00u0q4g.jpg","used":true,"who":"daimajia"},{"_id":"57c6265c421aa9125d96f53c","createdAt":"2016-08-31T08:35:40.27Z","desc":"8-31","publishedAt":"2016-08-31T11:41:56.41Z","source":"chrome","type":"福利","url":"http://ww4.sinaimg.cn/large/610dc034jw1f7cmpd95iaj20u011hjtt.jpg","used":true,"who":"代码家"},{"_id":"57c4fd22421aa9125fa3edb5","createdAt":"2016-08-30T11:27:30.559Z","desc":"8-30","publishedAt":"2016-08-30T11:38:36.625Z","source":"chrome","type":"福利","url":"http://ww2.sinaimg.cn/large/610dc034gw1f7bm1unn17j20u00u00wm.jpg","used":true,"who":"代码家"},{"_id":"57c2e9f1421aa91265f4a3ee","createdAt":"2016-08-28T21:41:05.165Z","desc":"8-29","publishedAt":"2016-08-29T11:32:28.388Z","source":"chrome","type":"福利","url":"http://ww1.sinaimg.cn/large/610dc034jw1f79sjqjn11j20u011hmzv.jpg","used":true,"who":"daimajia"}]
     */

    public boolean error;
    /**
     * _id : 57d16f1b421aa90d2d8a4f52
     * createdAt : 2016-09-08T22:00:59.815Z
     * desc : 09-09
     * publishedAt : 2016-09-09T11:53:48.777Z
     * source : chrome
     * type : 福利
     * url : http://ww2.sinaimg.cn/large/610dc034jw1f7mixvc7emj20ku0dv74p.jpg
     * used : true
     * who : 代码家
     */

    public List<ResultsBean> results;

    public static class ResultsBean {
        public String _id;
        public String createdAt;
        public String desc;
        public String publishedAt;
        public String source;
        public String type;
        public String url;
        public boolean used;
        public String who;
    }
}
