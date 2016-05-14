BRO HTTP INDEX

"sauron_bro_http": {
    "properties": {
      "TTLs": {
        "type": "double"
      },
      "date": {
        "index": "not_analyzed",
        "type": "string"
      },
      "rcptto": {
        "index": "not_analyzed",
        "type": "string"
      },
      "srcip": {
        "index": "not_analyzed",
        "type": "string"
      },
      "timedout": {
        "type": "boolean"
      },
      "querytypename": {
        "index": "not_analyzed",
        "type": "string"
      },
      "sha256": {
        "index": "not_analyzed",
        "type": "string"
      },
      "dstport": {
        "type": "long"
      },
      "recursionavailable": {
        "type": "boolean"
      },
      "subject": {
        "index": "not_analyzed",
        "type": "string"
      },
      "answers": {
        "index": "not_analyzed",
        "type": "string"
      },
      "authoritativeanswer": {
        "type": "boolean"
      },
      "mailfrom": {
        "index": "not_analyzed",
        "type": "string"
      },
      "source": {
        "index": "not_analyzed",
        "type": "string"
      },
      "extracted": {
        "index": "not_analyzed",
        "type": "string"
      },
      "src_ip_bytes": {
        "type": "long"
      },
      "src_mimetypes": {
        "index": "not_analyzed",
        "type": "string"
      },
      "statuscode": {
        "index": "not_analyzed",
        "type": "string"
      },
      "dst_ip_bytes": {
        "type": "long"
      },
      "path": {
        "index": "not_analyzed",
        "type": "string"
      },
      "password": {
        "index": "not_analyzed",
        "type": "string"
      },
      "protocol": {
        "index": "not_analyzed",
        "type": "string"
      },
      "dst_mimetypes": {
        "index": "not_analyzed",
        "type": "string"
      },
      "src_fuids": {
        "index": "not_analyzed",
        "type": "string"
      },
      "analyzers": {
        "index": "not_analyzed",
        "type": "string"
      },
      "reply_to": {
        "index": "not_analyzed",
        "type": "string"
      },
      "is_webmail": {
        "type": "boolean"
      },
      "src_bytes": {
        "type": "long"
      },
      "event_date": {
        "format": "strict_date_optional_time||epoch_millis",
        "type": "date"
      },
      "total_bytes": {
        "type": "long"
      },
      "from": {
        "index": "not_analyzed",
        "type": "string"
      },
      "dstip": {
        "index": "not_analyzed",
        "type": "string"
      },
      "msg_id": {
        "index": "not_analyzed",
        "type": "string"
      },
      "dst_bytes": {
        "type": "long"
      },
      "queryclass": {
        "type": "long"
      },
      "recursion": {
        "type": "boolean"
      },
      "x_originating_ip": {
        "index": "not_analyzed",
        "type": "string"
      },
      "method": {
        "index": "not_analyzed",
        "type": "string"
      },
      "second_received": {
        "index": "not_analyzed",
        "type": "string"
      },
      "local_orig": {
        "type": "boolean"
      },
      "rx_hosts": {
        "index": "not_analyzed",
        "type": "string"
      },
      "dst_fuids": {
        "index": "not_analyzed",
        "type": "string"
      },
      "history": {
        "index": "not_analyzed",
        "type": "string"
      },
      "responsecodename": {
        "index": "not_analyzed",
        "type": "string"
      },
      "tunnel_parents": {
        "index": "not_analyzed",
        "type": "string"
      },
      "is_orig": {
        "type": "boolean"
      },
      "tx_hosts": {
        "index": "not_analyzed",
        "type": "string"
      },
      "sha1": {
        "index": "not_analyzed",
        "type": "string"
      },
      "transactiondepth": {
        "type": "long"
      },
      "filename": {
        "index": "not_analyzed",
        "type": "string"
      },
      "reserved": {
        "type": "long"
      },
      "domain": {
        "index": "not_analyzed",
        "type": "string"
      },
      "dst_pkts": {
        "type": "long"
      },
      "guid": {
        "index": "not_analyzed",
        "type": "string"
      },
      "src_pkts": {
        "type": "long"
      },
      "post_body": {
        "index": "not_analyzed",
        "type": "string"
      },
      "info_code": {
        "index": "not_analyzed",
        "type": "string"
      },
      "local_src": {
        "type": "boolean"
      },
      "rejected": {
        "type": "boolean"
      },
      "useragent": {
        "index": "not_analyzed",
        "type": "string"
      },
      "transactionid": {
        "type": "long"
      },
      "duration": {
        "type": "double"
      },
      "info_msg": {
        "index": "not_analyzed",
        "type": "string"
      },
      "uid": {
        "index": "not_analyzed",
        "type": "string"
      },
      "response_body_length": {
        "type": "long"
      },
      "statusmsg": {
        "index": "not_analyzed",
        "type": "string"
      },
      "conn_state": {
        "index": "not_analyzed",
        "type": "string"
      },
      "queryclassname": {
        "index": "not_analyzed",
        "type": "string"
      },
      "seen_bytes": {
        "type": "long"
      },
      "fuids": {
        "index": "not_analyzed",
        "type": "string"
      },
      "missing_bytes": {
        "type": "long"
      },
      "querytype": {
        "type": "long"
      },
      "local_dst": {
        "type": "boolean"
      },
      "responsecode": {
        "type": "long"
      },
      "parent_fuid": {
        "index": "not_analyzed",
        "type": "string"
      },
      "src": {
        "index": "not_analyzed",
        "type": "string"
      },
      "truncated": {
        "type": "boolean"
      },
      "missed_bytes": {
        "type": "long"
      },
      "proxied": {
        "index": "not_analyzed",
        "type": "string"
      },
      "uri": {
        "index": "not_analyzed",
        "type": "string"
      },
      "request_body_length": {
        "type": "long"
      },
      "in_reply_to": {
        "index": "not_analyzed",
        "type": "string"
      },
      "overflow_bytes": {
        "type": "long"
      },
      "helo": {
        "index": "not_analyzed",
        "type": "string"
      },
      "referrer": {
        "index": "not_analyzed",
        "type": "string"
      },
      "sauron_ts": {
        "type": "long"
      },
      "last_reply": {
        "index": "not_analyzed",
        "type": "string"
      },
      "srcport": {
        "type": "long"
      },
      "mimetype": {
        "index": "not_analyzed",
        "type": "string"
      },
      "tls": {
        "type": "boolean"
      },
      "conn_uids": {
        "index": "not_analyzed",
        "type": "string"
      },
      "to": {
        "index": "not_analyzed",
        "type": "string"
      },
      "first_received": {
        "index": "not_analyzed",
        "type": "string"
      },
      "md5": {
        "index": "not_analyzed",
        "type": "string"
      },
      "ts": {
        "type": "double"
      },
      "username": {
        "index": "not_analyzed",
        "type": "string"
      }
    }
  }
}