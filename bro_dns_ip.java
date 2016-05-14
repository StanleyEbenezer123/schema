BRO DNS IP2
{
  "sauron_bro_dns": {
    "properties": {
      "TTLs": {
        "type": "double"
      },
      "srcip": {
        "index": "not_analyzed",
        "type": "string"
      },
      "querytypename": {
        "index": "not_analyzed",
        "type": "string"
      },
      "dstport": {
        "type": "long"
      },
      "rejected": {
        "type": "boolean"
      },
      "recursionavailable": {
        "type": "boolean"
      },
      "answers": {
        "index": "not_analyzed",
        "type": "string"
      },
      "authoritativeanswer": {
        "type": "boolean"
      },
      "transactionid": {
        "type": "long"
      },
      "uid": {
        "index": "not_analyzed",
        "type": "string"
      },
      "protocol": {
        "index": "not_analyzed",
        "type": "string"
      },
      "event_date": {
        "format": "strict_date_optional_time||epoch_millis",
        "type": "date"
      },
      "queryclassname": {
        "index": "not_analyzed",
        "type": "string"
      },
      "dstip": {
        "index": "not_analyzed",
        "type": "string"
      },
      "queryclass": {
        "type": "long"
      },
      "querytype": {
        "type": "long"
      },
      "recursion": {
        "type": "boolean"
      },
      "responsecode": {
        "type": "long"
      },
      "truncated": {
        "type": "boolean"
      },
      "responsecodename": {
        "index": "not_analyzed",
        "type": "string"
      },
      "reserved": {
        "type": "long"
      },
      "sauron_ts": {
        "type": "long"
      },
      "domain": {
        "index": "not_analyzed",
        "type": "string"
      },
      "guid": {
        "index": "not_analyzed",
        "type": "string"
      },
      "srcport": {
        "type": "long"
      },
      "ts": {
        "type": "double"
      }
    }
  }
}