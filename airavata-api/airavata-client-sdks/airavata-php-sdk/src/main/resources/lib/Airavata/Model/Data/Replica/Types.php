<?php
namespace Airavata\Model\Data\Replica;

/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;


final class ReplicaLocationCategory {
  const GATEWAY_DATA_STORE = 0;
  const COMPUTE_RESOURCE = 1;
  const LONG_TERM_STORAGE_RESOURCE = 2;
  const OTHER = 3;
  static public $__names = array(
    0 => 'GATEWAY_DATA_STORE',
    1 => 'COMPUTE_RESOURCE',
    2 => 'LONG_TERM_STORAGE_RESOURCE',
    3 => 'OTHER',
  );
}

final class ReplicaPersistentType {
  const TRANSIENT = 0;
  const PERSISTENT = 1;
  static public $__names = array(
    0 => 'TRANSIENT',
    1 => 'PERSISTENT',
  );
}

final class DataProductType {
  const FILE = 0;
  const COLLECTION = 1;
  static public $__names = array(
    0 => 'FILE',
    1 => 'COLLECTION',
  );
}

class DataProductModel {
  static $_TSPEC;

  /**
   * @var string
   */
  public $productUri = null;
  /**
   * @var string
   */
  public $gatewayId = null;
  /**
   * @var string
   */
  public $parentProductUri = null;
  /**
   * @var string
   */
  public $productName = null;
  /**
   * @var string
   */
  public $productDescription = null;
  /**
   * @var string
   */
  public $ownerName = null;
  /**
   * @var int
   */
  public $dataProductType = null;
  /**
   * @var int
   */
  public $productSize = null;
  /**
   * @var int
   */
  public $creationTime = null;
  /**
   * @var int
   */
  public $lastModifiedTime = null;
  /**
   * @var array
   */
  public $productMetadata = null;
  /**
   * @var \Airavata\Model\Data\Replica\DataReplicaLocationModel[]
   */
  public $replicaLocations = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'productUri',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'gatewayId',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'parentProductUri',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'productName',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'productDescription',
          'type' => TType::STRING,
          ),
        6 => array(
          'var' => 'ownerName',
          'type' => TType::STRING,
          ),
        7 => array(
          'var' => 'dataProductType',
          'type' => TType::I32,
          ),
        8 => array(
          'var' => 'productSize',
          'type' => TType::I32,
          ),
        9 => array(
          'var' => 'creationTime',
          'type' => TType::I64,
          ),
        10 => array(
          'var' => 'lastModifiedTime',
          'type' => TType::I64,
          ),
        11 => array(
          'var' => 'productMetadata',
          'type' => TType::MAP,
          'ktype' => TType::STRING,
          'vtype' => TType::STRING,
          'key' => array(
            'type' => TType::STRING,
          ),
          'val' => array(
            'type' => TType::STRING,
            ),
          ),
        12 => array(
          'var' => 'replicaLocations',
          'type' => TType::LST,
          'etype' => TType::STRUCT,
          'elem' => array(
            'type' => TType::STRUCT,
            'class' => '\Airavata\Model\Data\Replica\DataReplicaLocationModel',
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['productUri'])) {
        $this->productUri = $vals['productUri'];
      }
      if (isset($vals['gatewayId'])) {
        $this->gatewayId = $vals['gatewayId'];
      }
      if (isset($vals['parentProductUri'])) {
        $this->parentProductUri = $vals['parentProductUri'];
      }
      if (isset($vals['productName'])) {
        $this->productName = $vals['productName'];
      }
      if (isset($vals['productDescription'])) {
        $this->productDescription = $vals['productDescription'];
      }
      if (isset($vals['ownerName'])) {
        $this->ownerName = $vals['ownerName'];
      }
      if (isset($vals['dataProductType'])) {
        $this->dataProductType = $vals['dataProductType'];
      }
      if (isset($vals['productSize'])) {
        $this->productSize = $vals['productSize'];
      }
      if (isset($vals['creationTime'])) {
        $this->creationTime = $vals['creationTime'];
      }
      if (isset($vals['lastModifiedTime'])) {
        $this->lastModifiedTime = $vals['lastModifiedTime'];
      }
      if (isset($vals['productMetadata'])) {
        $this->productMetadata = $vals['productMetadata'];
      }
      if (isset($vals['replicaLocations'])) {
        $this->replicaLocations = $vals['replicaLocations'];
      }
    }
  }

  public function getName() {
    return 'DataProductModel';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->productUri);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->gatewayId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->parentProductUri);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->productName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->productDescription);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->ownerName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->dataProductType);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->productSize);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 9:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->creationTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 10:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->lastModifiedTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 11:
          if ($ftype == TType::MAP) {
            $this->productMetadata = array();
            $_size0 = 0;
            $_ktype1 = 0;
            $_vtype2 = 0;
            $xfer += $input->readMapBegin($_ktype1, $_vtype2, $_size0);
            for ($_i4 = 0; $_i4 < $_size0; ++$_i4)
            {
              $key5 = '';
              $val6 = '';
              $xfer += $input->readString($key5);
              $xfer += $input->readString($val6);
              $this->productMetadata[$key5] = $val6;
            }
            $xfer += $input->readMapEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 12:
          if ($ftype == TType::LST) {
            $this->replicaLocations = array();
            $_size7 = 0;
            $_etype10 = 0;
            $xfer += $input->readListBegin($_etype10, $_size7);
            for ($_i11 = 0; $_i11 < $_size7; ++$_i11)
            {
              $elem12 = null;
              $elem12 = new \Airavata\Model\Data\Replica\DataReplicaLocationModel();
              $xfer += $elem12->read($input);
              $this->replicaLocations []= $elem12;
            }
            $xfer += $input->readListEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('DataProductModel');
    if ($this->productUri !== null) {
      $xfer += $output->writeFieldBegin('productUri', TType::STRING, 1);
      $xfer += $output->writeString($this->productUri);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->gatewayId !== null) {
      $xfer += $output->writeFieldBegin('gatewayId', TType::STRING, 2);
      $xfer += $output->writeString($this->gatewayId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->parentProductUri !== null) {
      $xfer += $output->writeFieldBegin('parentProductUri', TType::STRING, 3);
      $xfer += $output->writeString($this->parentProductUri);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->productName !== null) {
      $xfer += $output->writeFieldBegin('productName', TType::STRING, 4);
      $xfer += $output->writeString($this->productName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->productDescription !== null) {
      $xfer += $output->writeFieldBegin('productDescription', TType::STRING, 5);
      $xfer += $output->writeString($this->productDescription);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ownerName !== null) {
      $xfer += $output->writeFieldBegin('ownerName', TType::STRING, 6);
      $xfer += $output->writeString($this->ownerName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->dataProductType !== null) {
      $xfer += $output->writeFieldBegin('dataProductType', TType::I32, 7);
      $xfer += $output->writeI32($this->dataProductType);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->productSize !== null) {
      $xfer += $output->writeFieldBegin('productSize', TType::I32, 8);
      $xfer += $output->writeI32($this->productSize);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->creationTime !== null) {
      $xfer += $output->writeFieldBegin('creationTime', TType::I64, 9);
      $xfer += $output->writeI64($this->creationTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->lastModifiedTime !== null) {
      $xfer += $output->writeFieldBegin('lastModifiedTime', TType::I64, 10);
      $xfer += $output->writeI64($this->lastModifiedTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->productMetadata !== null) {
      if (!is_array($this->productMetadata)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('productMetadata', TType::MAP, 11);
      {
        $output->writeMapBegin(TType::STRING, TType::STRING, count($this->productMetadata));
        {
          foreach ($this->productMetadata as $kiter13 => $viter14)
          {
            $xfer += $output->writeString($kiter13);
            $xfer += $output->writeString($viter14);
          }
        }
        $output->writeMapEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaLocations !== null) {
      if (!is_array($this->replicaLocations)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('replicaLocations', TType::LST, 12);
      {
        $output->writeListBegin(TType::STRUCT, count($this->replicaLocations));
        {
          foreach ($this->replicaLocations as $iter15)
          {
            $xfer += $iter15->write($output);
          }
        }
        $output->writeListEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class DataReplicaLocationModel {
  static $_TSPEC;

  /**
   * @var string
   */
  public $replicaId = null;
  /**
   * @var string
   */
  public $productUri = null;
  /**
   * @var string
   */
  public $replicaName = null;
  /**
   * @var string
   */
  public $replicaDescription = null;
  /**
   * @var int
   */
  public $creationTime = null;
  /**
   * @var int
   */
  public $lastModifiedTime = null;
  /**
   * @var int
   */
  public $validUntilTime = null;
  /**
   * @var int
   */
  public $replicaLocationCategory = null;
  /**
   * @var int
   */
  public $replicaPersistentType = null;
  /**
   * @var string
   */
  public $storageResourceId = null;
  /**
   * @var string
   */
  public $filePath = null;
  /**
   * @var array
   */
  public $replicaMetadata = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'replicaId',
          'type' => TType::STRING,
          ),
        2 => array(
          'var' => 'productUri',
          'type' => TType::STRING,
          ),
        3 => array(
          'var' => 'replicaName',
          'type' => TType::STRING,
          ),
        4 => array(
          'var' => 'replicaDescription',
          'type' => TType::STRING,
          ),
        5 => array(
          'var' => 'creationTime',
          'type' => TType::I64,
          ),
        6 => array(
          'var' => 'lastModifiedTime',
          'type' => TType::I64,
          ),
        7 => array(
          'var' => 'validUntilTime',
          'type' => TType::I64,
          ),
        8 => array(
          'var' => 'replicaLocationCategory',
          'type' => TType::I32,
          ),
        9 => array(
          'var' => 'replicaPersistentType',
          'type' => TType::I32,
          ),
        10 => array(
          'var' => 'storageResourceId',
          'type' => TType::STRING,
          ),
        11 => array(
          'var' => 'filePath',
          'type' => TType::STRING,
          ),
        12 => array(
          'var' => 'replicaMetadata',
          'type' => TType::MAP,
          'ktype' => TType::STRING,
          'vtype' => TType::STRING,
          'key' => array(
            'type' => TType::STRING,
          ),
          'val' => array(
            'type' => TType::STRING,
            ),
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['replicaId'])) {
        $this->replicaId = $vals['replicaId'];
      }
      if (isset($vals['productUri'])) {
        $this->productUri = $vals['productUri'];
      }
      if (isset($vals['replicaName'])) {
        $this->replicaName = $vals['replicaName'];
      }
      if (isset($vals['replicaDescription'])) {
        $this->replicaDescription = $vals['replicaDescription'];
      }
      if (isset($vals['creationTime'])) {
        $this->creationTime = $vals['creationTime'];
      }
      if (isset($vals['lastModifiedTime'])) {
        $this->lastModifiedTime = $vals['lastModifiedTime'];
      }
      if (isset($vals['validUntilTime'])) {
        $this->validUntilTime = $vals['validUntilTime'];
      }
      if (isset($vals['replicaLocationCategory'])) {
        $this->replicaLocationCategory = $vals['replicaLocationCategory'];
      }
      if (isset($vals['replicaPersistentType'])) {
        $this->replicaPersistentType = $vals['replicaPersistentType'];
      }
      if (isset($vals['storageResourceId'])) {
        $this->storageResourceId = $vals['storageResourceId'];
      }
      if (isset($vals['filePath'])) {
        $this->filePath = $vals['filePath'];
      }
      if (isset($vals['replicaMetadata'])) {
        $this->replicaMetadata = $vals['replicaMetadata'];
      }
    }
  }

  public function getName() {
    return 'DataReplicaLocationModel';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->replicaId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->productUri);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->replicaName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->replicaDescription);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 5:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->creationTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 6:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->lastModifiedTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 7:
          if ($ftype == TType::I64) {
            $xfer += $input->readI64($this->validUntilTime);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 8:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->replicaLocationCategory);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 9:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->replicaPersistentType);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 10:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->storageResourceId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 11:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->filePath);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 12:
          if ($ftype == TType::MAP) {
            $this->replicaMetadata = array();
            $_size16 = 0;
            $_ktype17 = 0;
            $_vtype18 = 0;
            $xfer += $input->readMapBegin($_ktype17, $_vtype18, $_size16);
            for ($_i20 = 0; $_i20 < $_size16; ++$_i20)
            {
              $key21 = '';
              $val22 = '';
              $xfer += $input->readString($key21);
              $xfer += $input->readString($val22);
              $this->replicaMetadata[$key21] = $val22;
            }
            $xfer += $input->readMapEnd();
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('DataReplicaLocationModel');
    if ($this->replicaId !== null) {
      $xfer += $output->writeFieldBegin('replicaId', TType::STRING, 1);
      $xfer += $output->writeString($this->replicaId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->productUri !== null) {
      $xfer += $output->writeFieldBegin('productUri', TType::STRING, 2);
      $xfer += $output->writeString($this->productUri);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaName !== null) {
      $xfer += $output->writeFieldBegin('replicaName', TType::STRING, 3);
      $xfer += $output->writeString($this->replicaName);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaDescription !== null) {
      $xfer += $output->writeFieldBegin('replicaDescription', TType::STRING, 4);
      $xfer += $output->writeString($this->replicaDescription);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->creationTime !== null) {
      $xfer += $output->writeFieldBegin('creationTime', TType::I64, 5);
      $xfer += $output->writeI64($this->creationTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->lastModifiedTime !== null) {
      $xfer += $output->writeFieldBegin('lastModifiedTime', TType::I64, 6);
      $xfer += $output->writeI64($this->lastModifiedTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->validUntilTime !== null) {
      $xfer += $output->writeFieldBegin('validUntilTime', TType::I64, 7);
      $xfer += $output->writeI64($this->validUntilTime);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaLocationCategory !== null) {
      $xfer += $output->writeFieldBegin('replicaLocationCategory', TType::I32, 8);
      $xfer += $output->writeI32($this->replicaLocationCategory);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaPersistentType !== null) {
      $xfer += $output->writeFieldBegin('replicaPersistentType', TType::I32, 9);
      $xfer += $output->writeI32($this->replicaPersistentType);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->storageResourceId !== null) {
      $xfer += $output->writeFieldBegin('storageResourceId', TType::STRING, 10);
      $xfer += $output->writeString($this->storageResourceId);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->filePath !== null) {
      $xfer += $output->writeFieldBegin('filePath', TType::STRING, 11);
      $xfer += $output->writeString($this->filePath);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->replicaMetadata !== null) {
      if (!is_array($this->replicaMetadata)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('replicaMetadata', TType::MAP, 12);
      {
        $output->writeMapBegin(TType::STRING, TType::STRING, count($this->replicaMetadata));
        {
          foreach ($this->replicaMetadata as $kiter23 => $viter24)
          {
            $xfer += $output->writeString($kiter23);
            $xfer += $output->writeString($viter24);
          }
        }
        $output->writeMapEnd();
      }
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}


